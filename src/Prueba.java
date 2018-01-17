import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Prueba  {
	//private static Logger logger = LogManager.getLogger(Prueba.class);
	private static List<Logger> loggers = new ArrayList<Logger>();
	//private static Connection connection = DriverManager()

	
	static {
		loggers.add(LogManager.getLogger("ErroresCalcular"));
		loggers.add(LogManager.getLogger("DebugsAConseguir"));
		loggers.add(LogManager.getLogger("DBAppender"));
	
	}
	@SuppressWarnings("deprecation")	
	public static void main(String[] args) throws IOException, SQLException {
		Logger loggerError = loggers.get(0);
		Logger loggerDebug = loggers.get(1);
		Logger loggerDb = loggers.get(2);
		
		// Iniciamos los logs para cada caso
		loggerError.trace("Iniciando");
		loggerDebug.trace("Iniciando");
		loggerDb.trace("Iniciando");
		
		loggerDebug.entry();
		loggerError.entry();		
		
		// Tomamos una entrada
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresar número: ");
		
		int a = input.nextInt();
		input.close();

		if (a < 5) {
			loggerError.error("no puede ser 5");  // Generamos la escritura en los logs de error
			loggerDb.error("no puede ser menor o igual que 5");
			loggerDebug.debug("tinieblas");  // Generamos la escritura en debug
		}
	}
	
	public int AreaRectangulo(int x, int y) {
		return x * y;
	}
}	