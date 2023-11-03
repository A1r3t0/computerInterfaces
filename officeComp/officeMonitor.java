package creatingComputers.computerInterfaces.officeComp;

import creatingComputers.computerInterfaces.monitor;

public class officeMonitor implements monitor {
    @Override
    public void showView() {
        System.out.println("На мониторе видно приложения для работы");
    }
}
