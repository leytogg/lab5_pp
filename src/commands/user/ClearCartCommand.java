package commands.user;

import commands.Command;

public class ClearCartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Очищення...Успішно");
    }
}
