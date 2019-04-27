package bridge_pattern;

/**
 * @author dingbin
 * @date 2019/4/25 14:15
 */

public class BlackColor implements Color {
    @Override
    public void withColor(String s) {
        System.out.print("黑色的"+s);
    }
}
