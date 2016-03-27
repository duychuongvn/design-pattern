package vn.chuonghd.journaldev.structuralpattern.proxy;

import java.io.IOException;

/**
 * Created by huynhduychuong on 3/22/2016.
 */
public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("admin".equals(user) && "admin".equals(pwd)) {
            isAdmin = true;
        }
        commandExecutor = new CommandExecutorImpl();
    }

    public void runCommand(String cmd) throws Exception {

        if(isAdmin) {
            commandExecutor.runCommand(cmd);
        } else if (cmd.trim().startsWith("rm")){
            throw new IOException("Access denied");
        } else {
            commandExecutor.runCommand(cmd);
        }
    }
}