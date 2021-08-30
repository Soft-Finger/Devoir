public class LogMessage implements ILoggable {
    private String message;

    public LogMessage(String message) {
        this.message = message;
    }

    @Override
    public String logTrace(String m) {
        return this.message = m;
    }
}
