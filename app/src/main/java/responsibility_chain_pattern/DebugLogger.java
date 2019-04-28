package responsibility_chain_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 11:05
 */

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        super(level);
    }

    @Override
    void logMsg(int level, String msg) {
        if (level>=this.level){
            System.out.print(msg+" DebugLogger "+level);
        }else{
            abstractLogger.logMsg(level,msg);
        }
    }
}
