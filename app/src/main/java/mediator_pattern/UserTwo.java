package mediator_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 16:21
 */

public class UserTwo extends User {

    public UserTwo(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMsg(String msg) {
        mediator.constact(msg,this);
    }

    @Override
    void receiveMsg(String msg,User fromUser) {
        System.out.println(getName()+"收到"+fromUser.getName()+"消息："+msg);
    }
}
