package command_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 13:51
 */

public class FireCommand implements Command {

    Receiver receiver;

    public FireCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe(String s) {
        receiver.receive(s);

    }
}
