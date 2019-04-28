package bridge_pattern;

/**
 * @author dingbin
 * @date 2019/4/25 14:15
 */

public class Test {

    public static void main(String[] args) {
        BlackColor blackColor = new BlackColor();
        CircleShape circleShape = new CircleShape();

        circleShape.setColor(blackColor);

        circleShape.draw();
    }
}
