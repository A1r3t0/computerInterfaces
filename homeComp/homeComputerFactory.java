package creatingComputers.computerInterfaces.homeComp;

import creatingComputers.computerInterfaces.*;

public class homeComputerFactory implements computerFactory {
    @Override
    public systemUnit createSystemUnit() {
        return new homeSystemUnit();
    }

    @Override
    public keyboard createKeyboard() {
        return new homeKeyboard();
    }

    @Override
    public monitor createMonitor() {
        return new homeMonitor();
    }

    @Override
    public mouse createMouse() {
        return new homeMouse();
    }
}
