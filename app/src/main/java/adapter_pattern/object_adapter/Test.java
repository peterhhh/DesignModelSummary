package adapter_pattern.object_adapter;

/**
 * @author dingbin
 * @date 2019/4/25 11:18
 */

public class Test {

    public static void main(String[] args) {
        Source source = new Source();
        TargetClassImpl target = new Adapter(source);
        target.method1();
        target.method2();
    }
}
