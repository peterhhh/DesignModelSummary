package state_pattern;

/**
 * 行为随状态改变而改变，状态类改变了，行为也就改变了
 * @author dingbin
 * @date 2019/4/27 11:41
 */

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        context.setState(startState);
        context.getState().doSomething();

        StopState stopState = new StopState();
        context.setState(stopState);
        stopState.doAction(context);

    }
}
