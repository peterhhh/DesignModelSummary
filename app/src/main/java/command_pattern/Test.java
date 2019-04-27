package command_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 13:54
 */

public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        FireCommand command = new FireCommand(receiver);
        Sir sir = new Sir(command);
        sir.invoke("开火");
    }
}
