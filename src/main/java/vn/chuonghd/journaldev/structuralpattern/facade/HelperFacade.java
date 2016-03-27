package vn.chuonghd.journaldev.structuralpattern.facade;

import java.sql.Connection;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public class HelperFacade {

    public static enum DBType {MYSQL, ORACLE}

    public static enum ReportType {HTML, PDF}

    public void generateReport(DBType dbType, ReportType reportType, String tableName) {

        Connection connection = null;
        switch (dbType) {
            case MYSQL:
                connection = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(connection, tableName);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPdfReport(connection, tableName);
                        break;
                }
                break;
            case ORACLE:
                connection = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(connection, tableName);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePdfReport(connection, tableName);
                        break;
                }
                break;
        }

    }
}
