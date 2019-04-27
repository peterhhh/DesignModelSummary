package adapter_pattern.object_adapter;

/**
 * @author dingbin
 * @date 2019/4/25 11:18
 */

public class Adapter implements TargetClassImpl {

    private Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.print("method2");
    }
}
