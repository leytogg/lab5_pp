package commands.admin;

import commands.Command;

public class DeleteRoomCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Видалення кімнати...\nУспішно");
    }
}
