package creatingComputers.computerInterfaces.homeComp;

import creatingComputers.computerInterfaces.mouse;

public class homeMouse implements mouse {
    @Override
    public void showMouse() {
        System.out.println("На столе лежит беспроводная компьютерная мышь");
    }
}
