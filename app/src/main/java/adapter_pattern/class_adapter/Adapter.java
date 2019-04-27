package adapter_pattern.class_adapter;

/**
 * @author dingbin
 * @date 2019/4/25 11:18
 */

public class Adapter extends Source implements TargetClassImpl {
    @Override
    public void method2() {
        System.out.print("method2");
    }
}
