package vn.chuonghd.journaldev.structuralpattern.facade;

import java.sql.Connection;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        System.out.println("Get MySQL DB Connection");
        return null;
    }

    public void generateMySqlPdfReport(Connection connection, String tableName) {
        System.out.println("Generating MySQL PDF Report...");
    }

    public void generateMySqlHTMLReport(Connection connection, String tableName) {
        System.out.println("Generating MySQL HTML Report...");
    }
}
