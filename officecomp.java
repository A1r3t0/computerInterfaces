package creatingComputers.computerInterfaces;

import creatingComputers.computerInterfaces.officeComp.*;

public class officecomp {
    public officecomp(officeComputerFactory officecomputer) {
        System.out.println("Создание офисного компьютера");
        systemUnit officeCompUnit = officecomputer.createSystemUnit();
        mouse officeMouse = officecomputer.createMouse();
        monitor officeMonitor = officecomputer.createMonitor();
        keyboard officeKeyboard = officecomputer.createKeyboard();
        officeCompUnit.showSystemUnit();
        officeMouse.showMouse();
        officeMonitor.showView();
        officeKeyboard.showKeyboard();
    }
}