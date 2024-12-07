package commands.user;

import commands.Command;

public class ViewCartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Ваш каталог: ");
    }
}
