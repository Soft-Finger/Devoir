public class ConsoleLogger extends AbstractTimestampLogger {
    protected String write() {
        return "";
    }

    @Override
    protected ILogger log(ILogger l) {
        return null;
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
