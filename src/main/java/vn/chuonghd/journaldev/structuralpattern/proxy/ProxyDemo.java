package vn.chuonghd.journaldev.structuralpattern.proxy;

/**
 * Created by huynhduychuong on 3/22/2016.
 */
public class ProxyDemo {
    public static void main(String[] args) throws Exception {
        CommandExecutor adminCommandExecutor = new CommandExecutorProxy("admin", "admin");
        adminCommandExecutor.runCommand("C:\\ls -ltr");

        
        CommandExecutor userCommandExecutor = new CommandExecutorProxy("user", "user");
        userCommandExecutor.runCommand("C:\\ls -ltr");
        userCommandExecutor.runCommand("C:\\rm -rf *");
    }
}
