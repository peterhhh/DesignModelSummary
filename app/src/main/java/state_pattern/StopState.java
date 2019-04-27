package state_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 11:40
 */

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    @Override
    public String doSomething() {
        return "stop";
    }
}
