package interpreter_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 14:18
 */

public class PlusExpression implements Expression {
    @Override
    public int express(Number number) {
        return number.getA()+number.getB();
    }
}
