package mediator_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 15:44
 */

public abstract class User {

    String name;
    Mediator mediator;


    public String getName() {
        return name;
    }

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }


    abstract void sendMsg(String msg);

    abstract void receiveMsg(String msg,User fromUser);

}
