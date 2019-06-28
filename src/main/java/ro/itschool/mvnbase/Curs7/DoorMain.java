package ro.itschool.mvnbase.Curs7;

public class DoorMain {
    public static void main(String[] args) {
        Door door = new Door();
        door.closeDoor();
        System.out.println("Door is closed? "+!door.isOpen());
        door.openDoor();
        System.out.println("Door is opened? "+door.isOpen());

        Door door2 = new Door(true, false);
        System.out.println(door2);

        DoorMain main = new DoorMain();
        System.out.println(main.toString());
    }
}
