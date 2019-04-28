package command_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 13:52
 */

public class Sir {
    Command command;

    public Sir(Command command) {
        this.command = command;
    }

    public void invoke(String s){
        command.exe(s);
    }
}
