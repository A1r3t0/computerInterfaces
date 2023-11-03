package creatingComputers.computerInterfaces;

import creatingComputers.computerInterfaces.homeComp.homeComputerFactory;

public class homecomp {
    public homecomp(homeComputerFactory homecomputer) {
        System.out.println("Создание домашнего компьютера");
        systemUnit homeCompUnit = homecomputer.createSystemUnit();
        mouse homeMouse = homecomputer.createMouse();
        monitor homeMonitor = homecomputer.createMonitor();
        keyboard homeKeyboard = homecomputer.createKeyboard();
        homeCompUnit.showSystemUnit();
        homeMouse.showMouse();
        homeMonitor.showView();
        homeKeyboard.showKeyboard();
    }
}
