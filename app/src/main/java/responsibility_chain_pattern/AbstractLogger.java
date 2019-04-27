package responsibility_chain_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 10:59
 */

public abstract class AbstractLogger {
    protected int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    protected AbstractLogger abstractLogger;

    public void setAbstractLogger(AbstractLogger abstractLogger) {
        this.abstractLogger = abstractLogger;
    }

    abstract void logMsg(int level,String msg);

}
