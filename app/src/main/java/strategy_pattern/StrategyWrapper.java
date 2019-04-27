package strategy_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 13:15
 * 策略装饰类，持有策略类引用，供客户端调用
 */

public class StrategyWrapper {

    private StrategyImpl strategyImpl;

    public StrategyWrapper(StrategyImpl strategyImpl) {
        this.strategyImpl = strategyImpl;
    }

    public int calucate(int a,int b){
       return strategyImpl.cal(a,b);
    }

}
