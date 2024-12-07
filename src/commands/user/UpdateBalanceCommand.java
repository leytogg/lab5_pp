package commands.user;

import commands.Command;

public class UpdateBalanceCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Поповнення...\nУспішно");
    }
}
