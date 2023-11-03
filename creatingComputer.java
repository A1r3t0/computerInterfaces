package creatingComputers.computerInterfaces;

import creatingComputers.computerInterfaces.homeComp.homeComputerFactory;
import creatingComputers.computerInterfaces.officeComp.officeComputerFactory;

public class creatingComputer {
    public static void main(String[] args) {
        homeComputerFactory homeComputer1 = new homeComputerFactory();
        homecomp comp1 = new homecomp(homeComputer1);
        System.out.println("-------------------------------");
        officeComputerFactory officeComputer1 = new officeComputerFactory();
        officecomp comp2 = new officecomp(officeComputer1);
    }
}
