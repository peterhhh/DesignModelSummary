package visitor_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 16:02
 */

interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor keyboard);
}
