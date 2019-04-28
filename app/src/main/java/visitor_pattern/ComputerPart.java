package visitor_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 16:02
 */

public interface ComputerPart {

    void accept(ComputerPartVisitor mComputerPartVisitor);

}
