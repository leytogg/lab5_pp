package commands.admin;

import commands.Command;

public class AddToyCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Добавлення іграшки...\nУспішно");
    }
}
