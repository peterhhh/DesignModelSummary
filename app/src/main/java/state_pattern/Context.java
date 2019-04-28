package state_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 11:39
 */

public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }




}
