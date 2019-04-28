package strategy_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 13:13
 * 具体策略实现类
 */

public class AddStrategy implements StrategyImpl {
    @Override
    public int cal(int a, int b) {
        return a+b;
    }
}
