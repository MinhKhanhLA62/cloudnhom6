package vn.banhang.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import vn.banhang.connection.DBConnect;

public class DBConnect {
	/*
	 * private final String serverName = "localhost"; private final String dbName =
	 * "BanTraiCayWeb"; private final String portNumber = "1433"; private final
	 * String instance = "";// MSSQLSERVER LEAVE THIS ONE EMPTY IF YOUR SQL IS A
	 * SINGLE INSTANCE private final String userID = "sa"; private final String
	 * password = "123";
	 * 
	 * public Connection getConnection() throws Exception {
	 * 
	 * String url = "jdbc:sqlserver://" + serverName +
	 * "\\" + instance + ";databaseName=" + dbName; if (instance == null ||
	 * instance.trim().isEmpty()) url = "jdbc:sqlserver://" + serverName + ":" +
	 * portNumber + ";databaseName=" + dbName;
	 * Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); return
	 * DriverManager.getConnection(url, userID, password);
	 * 
	 * // String url = "jdbc:mysql://" + serverName + "\\" + instance + "/" +
	 * dbName; // if (instance == null || instance.trim().isEmpty()) // url =
	 * "jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName; //
	 * Class.forName("com.mysql.cj.jdbc.Driver"); // return
	 * DriverManager.getConnection(url, userID, password); }
	 */

	private final String instanceConnectionName = "robust-builder-406013:asia-southeast1:so1tvd";
    private final String dbName = "BanTraiCayWeb";
    private final String userID = "sqlserver";
    private final String password = "123456";
    

    public Connection getConnection() throws Exception {

    	
    	String url = String.format("jdbc:jtds:sqlserver://34.143.206.165/%s", dbName);

    	
//    	String url = String.format("jdbc:jtds:sqlserver://google/%s;cloudSqlInstance=%s;socketFactory=com.google.cloud.sql.sqlserver.SocketFactory",
//    			 dbName, instanceConnectionName);

        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        return DriverManager.getConnection(url, userID, password);
    }
    

	public static void main(String[] args) {
		try {
			System.out.println(new DBConnect().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
