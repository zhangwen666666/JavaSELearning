package zw;


import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import zw.factory.UsbKingFactory;
import zw.interceptor.CglibInterceptor;
import zw.service.UsbSell;

public class Main {
    public static void main(String[] args) {
        // 生成目标代理类
        String path = "F:\\JavaCode\\JavaSELearning\\JavaSE进阶\\Learning";
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, path);

        // 得到方法拦截器
        CglibInterceptor interceptor = new CglibInterceptor();
        // 使用框架CGLIB生成目标类的子类(代理类)实现增强
        Enhancer enhancer = new Enhancer();
        // 设置父类字节码
        enhancer.setSuperclass(UsbKingFactory.class);
        // 设置拦截处理
        enhancer.setCallback(interceptor);
        UsbSell service = (UsbSell) enhancer.create();
        float price = service.sell(2);
        System.out.println(price);
    }
}
