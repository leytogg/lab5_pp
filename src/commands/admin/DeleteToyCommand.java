package commands.admin;

import commands.Command;

public class DeleteToyCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Видалення іграшки...\nУспішно");
    }
}
