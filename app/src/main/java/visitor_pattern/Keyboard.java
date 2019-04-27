package visitor_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 16:05
 */

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor mComputerPartVisitor) {
        mComputerPartVisitor.visit(this);
    }




}
