import org.apache.log4j.*;

public class LoggingUtil {
	private static final Logger logger = Logger.getLogger(LoggingUtil.class);
	static {
		BasicConfigurator.configure();
	}
	
	public static void logMessage(String message, MessageType messageType) {
		switch(messageType) {
		case INFO: 
			logger.info(message);
			break;
		case DEBUG:
			logger.debug(message);
			break;
		case ERROR:
			logger.error(message);
			break;
		default:
			throw new IllegalArgumentException("Wrong message type!");	
		}
	}
}

enum MessageType {
	INFO,
	DEBUG,
	ERROR;
}
