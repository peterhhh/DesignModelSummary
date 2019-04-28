package adapter_pattern.class_adapter;

/**
 * @author dingbin
 * @date 2019/4/25 11:18
 */

public class Test {

    public static void main(String[] args) {
        TargetClassImpl target = new Adapter();
        //这里调用的method1其实就是source的method1方法，所以这个Adapter类就是将Source类的功能扩展到TargetClassImpl接口类中了
        //所以类适配的核心就是目标接口中包含要适配类的同名方法。
        target.method1();
        target.method2();
    }
}
