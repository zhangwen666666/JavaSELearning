package d;

import a.b.Person;
import annotation.Column;
import annotation.Table;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


//a.Student
public class Test {
    public static void main(String[] args) {
        String classpathRoot = Thread.currentThread().getContextClassLoader().getResource(".").getPath();
        File file = new File(classpathRoot);
        List<String> list = new ArrayList<>();
        getClassAbsolutePath(file, list);
        //System.out.println(file);
        //System.out.println(classpathRoot);
        //System.out.println(list);
        //System.out.println(file.getAbsolutePath());
        List<String> strClassNames = getClassName(file.getAbsolutePath(), list);
        String statement = getCreateTableStatement(strClassNames);
        System.out.println(statement);
    }

    /**
     * @param strClassNames 这是一个列表，其中存放了class文件的完整类名
     * @return 返回建表语句
     */
    private static String getCreateTableStatement(List<String> strClassNames) {
        StringBuilder s = new StringBuilder();
        for (String strClassName : strClassNames) {
            try {
                Class<?> className = Class.forName(strClassName);
                //如果当前类被@Table标注了
                if (className.isAnnotationPresent(Table.class)) {
                    //System.out.println(className.getName());
                    s.append("create table ");

                    //获取表名
                    Table annotation = className.getAnnotation(Table.class);
                    s.append(annotation.value());
                    s.append(" (\n");

                    //获取类的属性名和类型
                    Field[] fields = className.getDeclaredFields();
                    for (Field field : fields) {
                        //判断该属性值是否被@Column注解标注
                        if (field.isAnnotationPresent(Column.class)) {
                            //如果被标注了
                            Column fieldAnnotation = field.getAnnotation(Column.class);
                            //获取标注中的属性名
                            s.append("\t");
                            s.append(fieldAnnotation.name());
                            //获取标注中的属性类型
                            s.append(" ");
                            s.append(fieldAnnotation.type());
                            s.append(",\n");
                        }
                    }
                    if (s.charAt(s.length() - 2) == ',')
                        s.deleteCharAt(s.length() - 2);
                    s.append(");\n");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return s.toString();
    }

    /**
     * @param rootPath 根路径
     * @param list     存放所有类的绝对路径的列表
     * @return 返回一个List集合，其中存放每个类的完整类名
     */
    private static List<String> getClassName(String rootPath, List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String path : list) {
            //将根路径去掉
            path = path.replace(rootPath, "");
            //去掉第一个\
            path = path.substring(1);
            //将所有的\替换为.
            path = path.replace("\\", ".");
            //将最后的.class去掉
            path = path.replace(".class", "");
            newList.add(path);
            //System.out.println(path);
        }
        return newList;
    }

    /**
     * @param file 以当前文件为根，开始找所有的class文件
     * @param list 存放所有的class文件的绝对路径
     */
    public static void getClassAbsolutePath(File file, List<String> list) {
        //如果当前路径是文件
        if (file.isFile()) {
            String fileName = file.getName();
            if (fileName.endsWith(".class")) {
                //System.out.println(file.getName());
                list.add(file.getAbsolutePath());
            }
        } else if (file.isDirectory()) {
            //如果是文件夹，则获取所有子文件和子文件夹
            File[] subFiles = file.listFiles();
            //如果文件夹不为空
            if (subFiles != null) {
                for (File subFile : subFiles) {
                    getClassAbsolutePath(subFile, list);
                }
            }
        }
    }
}
