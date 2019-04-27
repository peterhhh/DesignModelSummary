package adapter_pattern.interface_adapter;

/**
 * @author dingbin
 * @date 2019/4/25 11:42
 */

public class ObjectOne extends Wrapper {

    @Override
    public void method1() {
        super.method1();
        System.out.print("method1");
    }
}
