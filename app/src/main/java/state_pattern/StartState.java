package state_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 11:39
 */

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    @Override
    public String doSomething() {
        return "start";
    }


}
