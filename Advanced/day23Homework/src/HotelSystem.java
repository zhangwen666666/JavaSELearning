/* 为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
        1、该系统的用户是：酒店前台。
        2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
        3、酒店中的每一个房间应该是一个java对象：Room
        4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
        5、系统应该对外提供的功能：
        可以预定房间：用户输入房间编号，订房。
        可以退房：用户输入房间编号，退房。
        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。*/
public class HotelSystem {
    private Room[][] rooms;

    public HotelSystem() {
    }

    public HotelSystem(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public void bookRoom(int id) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                //找到了房间
                if (id == rooms[i][j].getId()) {
                    if (rooms[i][j].getStatus() != "空闲") {
                        System.out.println(id + "号房间当前不可预订");
                        return;
                    }
                    rooms[i][j].setStatus("已预订");
                    System.out.println("成功预订" + id + "号房间");
                    return;
                }
            }
        }
        System.out.println("不存在" + id + "房间，预定失败");
    }

    public void cancelRoom(int id) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                //找到了房间
                if (id == rooms[i][j].getId()) {
                    if (rooms[i][j].getStatus().equals("空闲")) {
                        System.out.println(id + "号房间当前不可退房");
                        return;
                    }
                    rooms[i][j].setStatus("空闲");
                    System.out.println("成功退掉" + id + "号房间");
                    return;
                }
            }
        }
        System.out.println("不存在" + id + "房间，退房失败");
    }

    public void checkInRoom(int id) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                //找到了房间
                if (id == rooms[i][j].getId()) {
                    if (rooms[i][j].getStatus().equals("已入住")) {
                        System.out.println(id + "号房间当前不可入住");
                        return;
                    }
                    rooms[i][j].setStatus("已入住");
                    System.out.println("成功入住" + id + "号房间");
                    return;
                }
            }
        }
        System.out.println("不存在" + id + "房间，入住失败");
    }

    public void showRoomInfo() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("-----------------第" + (i + 1) + "层-------------------");
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.println(rooms[i][j]);
            }
        }
    }
}

class Room {
    private int id;
    private String roomType;
    private String status;

    public Room() {
    }

    public Room(int id) {
        this(id, "标准间", "空闲");
    }

    public Room(int id, String roomType) {
        this(id, roomType, "空闲");
    }

    public Room(int id, String roomType, String status) {
        this.id = id;
        this.roomType = roomType;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return "房间号：" + id + ", 房间类型：" + roomType + ", 房间状态：" + status;
    }
}


class User {
    public static void main(String[] args) {
        Room r1 = new Room(101, "标准间", "已预订");
        Room r2 = new Room(102, "标准间", "空闲");
        Room r3 = new Room(103, "标准间", "已入住");
        Room r4 = new Room(201, "大床房", "已预订");
        Room r5 = new Room(202, "大床房", "已预订");
        Room r6 = new Room(203, "大床房", "空闲");
        Room r7 = new Room(204, "大床房", "已入住");
        Room r8 = new Room(205, "大床房", "空闲");
        Room r9 = new Room(206, "大床房", "空闲");
        Room r10 = new Room(301, "家庭房", "空闲");
        Room r11 = new Room(302, "家庭房", "已预订");
        Room r12 = new Room(303, "家庭房", "已入住");
        Room[][] rooms = {{r1, r2, r3}, {r4, r5, r6, r7, r8, r9}, {r10, r11, r12}};

        HotelSystem hotel = new HotelSystem(rooms);
        hotel.showRoomInfo();

        hotel.bookRoom(101);
        hotel.bookRoom(102);
        hotel.bookRoom(205);
        hotel.bookRoom(308);

        hotel.showRoomInfo();

        hotel.checkInRoom(101);
        hotel.checkInRoom(103);
        hotel.checkInRoom(201);
        hotel.checkInRoom(206);
        hotel.checkInRoom(301);
        hotel.checkInRoom(307);

        hotel.showRoomInfo();

        hotel.cancelRoom(101);
        hotel.cancelRoom(203);
        hotel.cancelRoom(204);
        hotel.cancelRoom(206);
        hotel.cancelRoom(302);
        hotel.cancelRoom(305);

        hotel.showRoomInfo();
    }
}
