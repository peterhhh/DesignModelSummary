package observer_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 11:43
 */

public class ObserverOne implements Observer {
    @Override
    public void update(String s) {
        System.out.print("ObserverOne"+s);
    }
}
