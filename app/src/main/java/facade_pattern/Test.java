package facade_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 09:20
 */

public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.drawCircle();
        facade.drawRectangle();
    }
}
