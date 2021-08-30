public class ConsoleLogger extends AbstractTimestampLogger {
    protected String write() {
        return "";
    }

    @Override
    public void log(ILogger l) {
    }

    @Override
    protected String write(String l) {
        return null;
    }

    @Override
    public ILoggable log(ILoggable lo) {
        return null;
    }
}
