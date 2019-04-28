package visitor_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 16:08
 */

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor mComputerPartVisitor) {
        mComputerPartVisitor.visit(this);
    }



}
