package vn.chuonghd.journaldev.structuralpattern.proxy;

/**
 * Created by huynhduychuong on 3/22/2016.
 */
public class CommandExecutorImpl implements CommandExecutor {
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
