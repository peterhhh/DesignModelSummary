package bridge_pattern;

/**
 * @author dingbin
 * @date 2019/4/25 14:11
 */

public abstract class Shape {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void draw();

}
