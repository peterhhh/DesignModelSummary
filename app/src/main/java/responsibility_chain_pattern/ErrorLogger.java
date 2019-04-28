package responsibility_chain_pattern;

import android.util.Log;

/**
 * @author dingbin
 * @date 2019/4/26 11:04
 */

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    void logMsg(int level, String msg) {
        if (level >= this.level) {
            System.out.print(msg+" ErrorLogger "+level);
        }else{
            abstractLogger.logMsg(level,msg);
        }
    }
}
