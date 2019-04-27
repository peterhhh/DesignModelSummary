package visitor_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 16:09
 */

public class Test {

    public static void main(String[] args) {

        //keyboard作为被访问者，向外提供了一个提供访问的接口ComputerPartVisitor
        //职责单一
        Keyboard keyboard = new Keyboard();

        keyboard.accept(new ComputerPartDisplayVisitor());

    }
}
