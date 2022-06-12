package com.fasttrack;

public class Door {
    private boolean opened = true;
    private boolean locked;

    static{
        System.out.println("Before constructing");
    }
    public Door(boolean opened){
        this.opened=opened;
    }

    public Door(String locked){
        this.locked=Boolean.parseBoolean(locked);
    }
    public Door(boolean opened, boolean locked){
        this.opened=opened;
        if(opened){
            this.locked = false;
        }else{
            this.locked=locked;
        }
    }

    public boolean isOpened() {
        return opened;
    }

    public void hideField(){
        int opened = 1;
        System.out.println(this.opened);
    }

    public void closeDoor(){
        if(this.opened==false){
            System.out.println("Door is already closed");
        }else{
            this.opened = false;
            System.out.println("Closed the door");
        }
    }
}
