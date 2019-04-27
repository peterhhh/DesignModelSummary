package strategy_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 13:14
 * 具体实现类
 */

public class SubtractStrategy implements StrategyImpl {
    @Override
    public int cal(int a, int b) {
        return a - b;
    }
}
