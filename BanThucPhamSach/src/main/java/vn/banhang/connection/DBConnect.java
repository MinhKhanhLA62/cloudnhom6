package vn.banhang.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

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

	private static final String instanceConnectionName = "robust-builder-406013:asia-southeast1:so1tvd";
    private static final String dbName = "BanTraiCayWeb";
    private static final String userID = "sqlserver";
    private static final String password = "123456";
    

    public Connection getConnection() throws Exception {
//    	String url = String.format("jdbc:jtds:sqlserver://34.143.206.165/%s", dbName); 	
    	String url = String.format("jdbc:sqlserver://google/%s;cloudSqlInstance=%s;socketFactory=com.google.cloud.sql.sqlserver.SocketFactory",
    			 dbName, instanceConnectionName);
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        return DriverManager.getConnection(url, userID, password);
//            return createConnectionPool().getConnection();
    }

        // public static DataSource createConnectionPool() {
        //   // The configuration object specifies behaviors for the connection pool.
        //   HikariConfig config = new HikariConfig();
      
        //   // The following is equivalent to setting the config options below:
        //   // jdbc:sqlserver://;user=<DB_USER>;password=<DB_PASS>;databaseName=<DB_NAME>;
        //   // socketFactoryClass=com.google.cloud.sql.sqlserver.SocketFactory;
        //   // socketFactoryConstructorArg=<INSTANCE_CONNECTION_NAME>
      
        //   // See the link below for more info on building a JDBC URL for the Cloud SQL JDBC Socket Factory
        //   // https://github.com/GoogleCloudPlatform/cloud-sql-jdbc-socket-factory#creating-the-jdbc-url
      
        //   // Configure which instance and what database user to connect with.
        //   config
        //       .setDataSourceClassName("com.microsoft.sqlserver.jdbc.SQLServerDataSource");
        //   config.setUsername(userID); // e.g. "root", "sqlserver"
        //   config.setPassword(password); // e.g. "my-password"
        //   config.addDataSourceProperty("databaseName", dbName);
      
        //   config.addDataSourceProperty("socketFactoryClass",
        //       "com.google.cloud.sql.sqlserver.SocketFactory");
        //   config.addDataSourceProperty("socketFactoryConstructorArg", instanceConnectionName);
      
        //   // The Java Connector provides SSL encryption, so it should be disabled
        //   // at the driver level.
        //   config.addDataSourceProperty("encrypt", "false");
      
        //   // ... Specify additional connection properties here.
        //   // ...
      
        //   // Initialize the connection pool using the configuration object.
        //   return new HikariDataSource(config);
        // }
    

	public static void main(String[] args) {
		try {
			System.out.println(new DBConnect().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
