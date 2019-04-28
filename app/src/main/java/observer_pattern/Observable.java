package observer_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 11:37
 * 被观察者
 */

public interface Observable {

    /**
     * 注入观察者
     * @param observer
     */
    void addObservers(Observer observer);

    /**
     * 移除
     * @param observer
     */
    void removeObservers(Observer observer);

    /**
     * 通知所有观察者更新数据
     * @param objects
     */
    void notifyDataSetChanged(String objects);

}
