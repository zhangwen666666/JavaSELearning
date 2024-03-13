//一、请通过代码封装，实现如下需求：
//        编写一个类Book，代表教材:
//        1.具有属性：名称（title）、页数（pageNum）
//        2.其中页数不能少于200页，否则输出错误信息，并赋予默认值200
//        3.为各属性提供赋值和取值方法
//        4.具有方法:detail，用来在控制台输出每本教材的名称和页数
//        5.编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确

public class Book{
    private String title;
    private int pageNum;

    public Book(){}
    public Book(String title,int pageNum){
        this.title = title;
        if(pageNum < 200){
            System.out.println("页数不能少于200");
            this.pageNum = 200;
        }
        else
            this.pageNum = pageNum;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setPageNum(int pageNum){
        if(pageNum < 200){
            System.out.println("页数不能少于200");
            this.pageNum = 200;
        }
        else
            this.pageNum = pageNum;
    }
    public int getPageNum(){
        return pageNum;
    }

    public void detail(){
        System.out.println(this.title + "共有" + this.pageNum + "页");
    }
}
