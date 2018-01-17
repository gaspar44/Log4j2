
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionFactory {
	private static interface Singleton {
		  final ConnectionFactory INSTANCE = new ConnectionFactory();
		 }

		 private final BasicDataSource dataSource;

		 private ConnectionFactory() {

		  this.dataSource = new BasicDataSource();
		  dataSource.setUsername("root");
		  dataSource.setPassword("demodemo");
		  dataSource.setUrl("jdbc:mysql://localhost:3306/logging");
		  dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		 }

		 public static Connection getDatabaseConnection() throws SQLException {
		  return Singleton.INSTANCE.dataSource.getConnection();
		 }
}
