package log4j.setup;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Setup {
	static Logger log = Logger.getLogger(Setup.class.getName());

	public static void main(String[] args) throws IOException, SQLException {
		log.error("Hello this is a error message");
		log.debug("Hello this is an debug message");
		log.info("Hello this is an info message");
		if (log.isDebugEnabled()) {
			log.error("Hello this is an error message");
		}
	}

}
