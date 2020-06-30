package gg.steve.mc.framework.framework.cmd.misc;

import gg.steve.mc.framework.framework.message.GeneralMessage;
import gg.steve.mc.framework.framework.permission.PermissionNode;
import gg.steve.mc.framework.framework.cmd.SubCommand;
import org.bukkit.command.CommandSender;

public class HelpSubCmd extends SubCommand {

    public HelpSubCmd() {
        super("help", 0, 1, false, PermissionNode.HELP);
        addAlias("h");
    }

    @Override
    public void onCommand(CommandSender sender, String[] args) {
        GeneralMessage.HELP.message(sender);
    }
}
