package strategy_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 13:17
 * 所以策略模式就是；对象具有某种行为，但是在不同的环境下，该行为有不同的算法，比如每个人都要喝水，在冬天喝热水，在夏天喝冷水
 * 但对客户端隐藏具体的实现细节，彼此独立。
 *
 * 缺点：客户端必须知道所有的策略实现类以及他们的区别，以便使用他们；策略类多；
 */

public class Test {

    public static void main(String[] ar){
        AddStrategy addStrategy = new AddStrategy();
        StrategyWrapper strategyWrapper= new StrategyWrapper(addStrategy);
        int calucate = strategyWrapper.calucate(1, 4);
    }
}
