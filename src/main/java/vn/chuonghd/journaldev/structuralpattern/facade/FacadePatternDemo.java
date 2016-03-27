package vn.chuonghd.journaldev.structuralpattern.facade;

import java.sql.Connection;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public class FacadePatternDemo {
    private static final String tableName = "employee";

    public static void main(String[] args) {

        generateReportWithoutFacadePattern();
        System.out.println("**************");
        generateReportWithFacadePattern();
    }

    private static void generateReportWithoutFacadePattern() {

        System.out.println("Generate report without facade pattern");

        Connection mySqlConnection = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(mySqlConnection, tableName);

        Connection oracleConnection = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePdfReport(oracleConnection, tableName);

    }

    private static void generateReportWithFacadePattern() {
        System.out.println("Generate report with facade pattern");
        HelperFacade helperFacade = new HelperFacade();
        helperFacade.generateReport(HelperFacade.DBType.MYSQL, HelperFacade.ReportType.HTML, tableName);
        helperFacade.generateReport(HelperFacade.DBType.ORACLE, HelperFacade.ReportType.PDF, tableName);
    }
}
