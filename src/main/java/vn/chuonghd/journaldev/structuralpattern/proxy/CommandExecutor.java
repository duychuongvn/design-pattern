package vn.chuonghd.journaldev.structuralpattern.proxy;

/**
 * Created by huynhduychuong on 3/22/2016.
 */
public interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}
