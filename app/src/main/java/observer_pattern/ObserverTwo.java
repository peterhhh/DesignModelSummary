package observer_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 11:44
 */

public class ObserverTwo implements Observer {
    @Override
    public void update(String s) {
        System.out.print("ObserverTwo"+s);


    }
}
