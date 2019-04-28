package visitor_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 16:09
 */

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");

    }

    @Override
    public void visit(Monitor keyboard) {
        System.out.println("Displaying Monitor.");

    }
}
