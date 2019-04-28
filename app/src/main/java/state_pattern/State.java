package state_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 11:39
 */

public interface State {
    void doAction(Context context);

    String doSomething();
}
