package adapter_pattern.interface_adapter;

/**
 * @author dingbin
 * @date 2019/4/25 11:42
 */

public class ObjectTwo extends Wrapper {
    @Override
    public void method2() {
        super.method2();
        System.out.print("method2");
    }
}
