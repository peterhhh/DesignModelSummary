package responsibility_chain_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 11:06
 */

public class Test {
    public static void main(String[] args) {
        ErrorLogger errorLogger = new ErrorLogger(1000);
        DebugLogger debugLogger = new DebugLogger(500);
        errorLogger.setAbstractLogger(debugLogger);

        errorLogger.logMsg(500,"500哦");


    }
}
