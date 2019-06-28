package ro.itschool.mvnbase.Curs7;

public class Door {
    private boolean open;
    private boolean locked;

    Door() {
        open = true;
    }

    Door(boolean open) {
        this.open = open;
    }

    Door(boolean open, boolean locked) {
        this.open = open;
        this.locked = locked;
    }

    void openDoor() {
        locked = false;
        open = true;
    }

    void closeDoor() {
        locked = false;
        open = false;
    }

    void lockedDoor() {
        locked = true;
    }

    void unlockDoor() {
        locked = false;
    }

    boolean isLocked() {
        return locked;
    }

    boolean isOpen() {
        return open;
    }

    public String toString() {
        if(isOpen()){
            return "Door is open";
        }else if(isLocked()){
            return "Door is locked";
        }
        return "Door is open?" + open + "and is locked?" + locked;
    }
}
