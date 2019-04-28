package adapter_pattern.interface_adapter;

/**
 * @author dingbin
 * @date 2019/4/25 11:43
 */

public class Test {
    public static void main(String[] args) {
        ObjectOne objectOne= new ObjectOne();
        ObjectTwo objectTwo = new ObjectTwo();

        objectOne.method1();
        objectTwo.method2();

        objectOne.method1();
        objectTwo.method2();
    }

}
