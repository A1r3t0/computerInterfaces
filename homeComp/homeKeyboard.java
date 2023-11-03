package creatingComputers.computerInterfaces.homeComp;

import creatingComputers.computerInterfaces.keyboard;

public class homeKeyboard implements keyboard {
    @Override
    public void showKeyboard() {
        System.out.println("Печать производится с помощью клавиатуры с подсветкой");
    }
}
