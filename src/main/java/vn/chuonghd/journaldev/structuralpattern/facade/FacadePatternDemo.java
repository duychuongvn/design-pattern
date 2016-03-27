package vn.chuonghd.journaldev.structuralpattern.facade;

import java.sql.Connection;

/**
 * Facade pattern is more like a helper for client applications, it doesn’t
 * hide subsystem interfaces from the client. Whether to use Facade or
 * not is completely dependent on client code.
 * .. Facade pattern can be applied at any point of development, usually
 * when the number of interfaces grow and system gets complex.
 * .. Subsystem interfaces are not aware of Facade and they shouldn’t have
 * any reference of the Facade interface.
 * .. Facade pattern should be applied for similar kind of interfaces, its
 * purpose is to provide a single interface rather than multiple interfaces
 * that does the similar kind of jobs.
 * .. We can use Factory pattern with Facade to provide better interface to
 * client systems.
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
