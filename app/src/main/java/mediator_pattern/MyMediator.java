package mediator_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 15:48
 */

public class MyMediator implements Mediator {

    User owner;
    User user;

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void constact(String msg,User user) {
        if (user==owner){
            this.user.receiveMsg(msg,user);
        }else{
            this.owner.receiveMsg(msg,user);
        }
    }
}
