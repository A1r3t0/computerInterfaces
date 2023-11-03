package creatingComputers.computerInterfaces.officeComp;

import creatingComputers.computerInterfaces.*;

public class officeComputerFactory implements computerFactory {
    @Override
    public keyboard createKeyboard() {
        return new officeKeyboard();
    }

    @Override
    public monitor createMonitor() {
        return new officeMonitor();
    }

    @Override
    public mouse createMouse() {
        return new officeMouse();
    }

    @Override
    public systemUnit createSystemUnit() {
        return new officeSystemUnit();
    }
}
