package commands.admin;

import commands.Command;

public class AddRoomCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Добавлення кімнати...\nУспішно");
    }
}
