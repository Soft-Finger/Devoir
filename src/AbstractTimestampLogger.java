import java.time.Instant;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class AbstractTimestampLogger implements ILogger{
    public void log(ILogger l) {
        LocalDateTime timestamp  = LocalDateTime.now();
        String result = System.out.printf("%s : %s", timestamp.toString(), l.logTrace());
        write(result);
    };

    protected abstract String write(String l);
    public abstract ILoggable log(ILoggable lo);
}
