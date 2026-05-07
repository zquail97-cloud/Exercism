public class LogLine {

    // Stores the raw log entry for parsing
    private String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {

       // Extract the encoded log level from the brackets
        String level = logLine.substring(1, logLine.indexOf("]"));

        // Map abbreiavted log codes to their corresponding enum values
       return switch (level){
            case "TRC"-> LogLevel.TRACE;  
            case "DBG"-> LogLevel.DEBUG; 
            case "INF"-> LogLevel.INFO;    
            case "WRN"-> LogLevel.WARNING;  
            case "ERR"-> LogLevel.ERROR;    
            case "FTL"-> LogLevel.FATAL; 
            default -> LogLevel.UNKNOWN;   
        };
        
    }

    public String getOutputForShortLog() {

        // Convert the parsed log level to its compact numeric representation
        int encodedLevel = switch (getLogLevel()){
            case UNKNOWN -> 0;
            case TRACE -> 1;
            case DEBUG -> 2;
            case INFO -> 4;
            case WARNING -> 5;
            case ERROR -> 6;
            case FATAL -> 42;            
        };

     // Capture the string value after the encoded message, ending with ":"   
     String message = logLine.substring(logLine.indexOf(":")+1).trim();

     // Format as "<encoded_level>:<message>"
     return encodedLevel +":"+message;   
    }
}
