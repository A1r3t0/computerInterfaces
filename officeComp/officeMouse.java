package creatingComputers.computerInterfaces.officeComp;

import creatingComputers.computerInterfaces.mouse;

public class officeMouse implements mouse {
    @Override
    public void showMouse() {
        System.out.println("На столе лежит офисная компьютерная мышь");
    }
}
