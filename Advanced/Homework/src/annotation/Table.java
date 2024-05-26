package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 被Table标注的类，要生成建表语句
 * 这个注解需要被反射机制所读取
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Table {
    /**
     * 用来指定表的名字
     * @return 返回表的名字
     */
    String value();
}
