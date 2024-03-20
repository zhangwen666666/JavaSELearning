public class Computer {
    private String name;
    private InsertDrawable insertDrawable;

    public Computer() {
    }

    public Computer(String name,InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
        this.name = name;
    }

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void connection(){
        this.insertDrawable.insert();
    }

    public static void main(String[] args){
        Computer com = new Computer("章鱼小丸子",null);
        InsertDrawable mouse = new Mouse("联想");
        InsertDrawable keyboard = new Keyboard("罗技");
        InsertDrawable monitor = new Monitor("戴尔");
        InsertDrawable printer = new Printer("小米");

        com.setInsertDrawable(mouse);
        com.connection();
        com.setInsertDrawable(keyboard);
        com.connection();
        com.setInsertDrawable(monitor);
        com.connection();
        com.setInsertDrawable(printer);
        com.connection();

        InsertDrawable graphicsCard = new GraphicsCard("英伟达");
        com.setInsertDrawable(graphicsCard);
        com.connection();
    }
}
