public class LogLevels {
    
   static String message;
	static String logLevel;
	
	public static String message(String logLine) {

		

		return message = logLine.substring(logLine.indexOf(": ") + 2).trim();

	}

	public static String logLevel(String logLine) {
		
		
		return logLevel = logLine.substring(1, logLine.indexOf("]")).toLowerCase();
	}

    public static String reformat(String logLine) {
		
		return message(logLine)+" "+"("+logLevel(logLine)+")";
		
	}
}
