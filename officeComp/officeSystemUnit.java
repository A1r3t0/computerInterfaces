package creatingComputers.computerInterfaces.officeComp;

import creatingComputers.computerInterfaces.mouse;
import creatingComputers.computerInterfaces.systemUnit;

public class officeSystemUnit implements systemUnit {
    @Override
    public mouse showSystemUnit() {
        System.out.println("Компьютер имеет офисный системный блок");
        return null;
    }
}
