package interpreter_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 14:19
 */

public class Test {
    public static void main(String[] args) {
        //9+2-8
        int express = new MinusExpression().express(new Number(new PlusExpression().express(new Number(9, 2)), 8));
        System.out.println(express);

    }



}
