package creatingComputers.computerInterfaces.homeComp;

import creatingComputers.computerInterfaces.monitor;

public class homeMonitor implements monitor {
    @Override
    public void showView() {
        System.out.println("На мониторе видны иконки игр");
    }
}
