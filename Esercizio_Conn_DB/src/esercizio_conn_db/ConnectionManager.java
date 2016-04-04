package esercizio_conn_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionManager {


	private static Connection connection;


	public static Connection getConnectionWithDataSource() throws SQLException {
		if (connection == null) {
			MysqlDataSource ds = null;
			ds = new MysqlDataSource();
			ds.setUser("softuser");
			ds.setPassword("_s0ft*");
			ds.setServerName("a22docente");
			ds.setDatabaseName("soft2015");
			// ds.setPortNumber(portNumber);
			connection = ds.getConnection();
		}
		System.out.println(" - Connected to database - ");
		return connection;
	}
}