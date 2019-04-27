package flyweight_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 17:29
 */

public class Circle implements Shape{

    /**
     * 外部状态，固定值
     */
    private int color;
    /**
     * 内部状态，非固定
     */
    private float x;
    private float y;

    public Circle(int color) {
        this.color = color;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(x+"  "+y+"  "+color);

    }
}
