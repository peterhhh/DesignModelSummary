package observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingbin
 * @date 2019/3/27 11:42
 */

public class ObservableSource implements Observable {
    List<Observer> list = new ArrayList<>();


    @Override
    public void addObservers(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyDataSetChanged(String objects) {
        for (Observer observer : list) {
            observer.update(objects);
        }
    }
}
