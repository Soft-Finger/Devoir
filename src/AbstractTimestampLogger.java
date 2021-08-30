public abstract class AbstractTimestampLogger {
    protected abstract ILogger log(ILogger l);

    protected abstract String write(String l);
    public abstract ILoggable log(ILoggable lo);
}
