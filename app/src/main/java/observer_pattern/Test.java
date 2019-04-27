package observer_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 11:38
 * 观察者和被观察者的身份确认：类比下微信公众号的订阅系统，公众号主体更新文章后，所有已订阅用户都会同步收到推送
 * 那么谁是观察者？用户肯定是观察者，公众号主体就是被观察者，被观察者数据发生改变，通知观察者。
 */

public class Test {

    public static void main(String[] a){
        ObservableSource source = new ObservableSource();

        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();

        source.addObservers(observerOne);
        source.addObservers(observerTwo);
        source.notifyDataSetChanged("dingbin");
    }
}
