package creatingComputers.computerInterfaces.homeComp;

import creatingComputers.computerInterfaces.mouse;
import creatingComputers.computerInterfaces.systemUnit;

public class homeSystemUnit implements systemUnit {
    @Override
    public mouse showSystemUnit() {
        System.out.println("Компьютер имеет игровой системный блок с прозрачным корпусом");
        return null;
    }
}
