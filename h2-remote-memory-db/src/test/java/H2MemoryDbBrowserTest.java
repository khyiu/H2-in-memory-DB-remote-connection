import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.tools.Server;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class H2MemoryDbBrowserTest {

	private static final String DATABASE_URL = "jdbc:h2:mem:demo;USER=sa;INIT=RUNSCRIPT FROM 'classpath:/scripts/init-db.sql'";
	private static Connection conn;

	@BeforeClass
	public static void initDatabase() throws SQLException {
		conn = DriverManager.getConnection(DATABASE_URL); // creating SQL connection will trigger the DB creation
	}
	
	@AfterClass
	public static void closeDatabase() throws SQLException {
		conn.close();
	}

	@Test
	public void testMethodA() throws SQLException {
		Server server = Server.createTcpServer("-tcpPort", "9999");
		server.start();
		server.stop();
	}
	
	@Test
	public void testMethodB() throws SQLException {
		Server.startWebServer(conn);
	}
}