import java.util.Scanner;

/*编写程序模拟用户注册：
        1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
        2、输入信息之后，后台java程序模拟用户注册。
        3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。*/
public class UerService {
    public static void register(String username, String password) throws LengthException {
        if (username.length() < 6) {
            throw new LengthException("用户名长度太短");
        } else if (username.length() > 14) {
            throw new LengthException("用户名长度太长");
        } else {
            System.out.println("注册成功");
        }
    }
}


class LengthException extends Exception {
    public LengthException() {
    }

    public LengthException(String s) {
        super(s);
    }
}


class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();

        try {
            UerService.register(username,password);
        } catch (LengthException e) {
            System.out.println(e.getMessage());
        }
    }
}