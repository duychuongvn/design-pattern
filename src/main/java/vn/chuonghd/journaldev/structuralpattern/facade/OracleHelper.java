package vn.chuonghd.journaldev.structuralpattern.facade;

import java.sql.Connection;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public class OracleHelper {

    public static Connection getOracleDBConnection() {
        System.out.println("Get Oracle DB Connection");
        return null;
    }
    public void generateOraclePdfReport(Connection connection, String tableName) {
        System.out.println("Generating Oracle PDF Report...");
    }

    public void generateOracleHTMLReport(Connection connection, String tableName) {
        System.out.println("Generating Oracle HTML Report...");
    }

}
