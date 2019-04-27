package memento_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 09:57
 */

public class Test {


    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state1");
        originator.setState("state2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state3");
        originator.setState("state4");
        careTaker.add(originator.saveStateToMemento());
        System.out.println(careTaker.get(0).getState());
        System.out.println(careTaker.get(1).getState());

    }









}
