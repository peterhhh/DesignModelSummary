package mediator_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 16:17
 */

public class Test {
    public static void main(String[] args) {

        MyMediator myMediator = new MyMediator();

        UserOne userOne = new UserOne("房东",myMediator);
        UserTwo userTwo = new UserTwo("租客",myMediator);

        myMediator.setOwner(userOne);
        myMediator.setUser(userTwo);

        userOne.sendMsg("我有房出租");

    }



}
