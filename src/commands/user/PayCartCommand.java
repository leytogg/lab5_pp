package commands.user;

import commands.Command;

public class PayCartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Оплачено успішно");
    }
}
