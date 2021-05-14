package net.core;

import net.core.command.Command;

public interface UI {
    Command getCommand();
    void showMessage(String message);
}
