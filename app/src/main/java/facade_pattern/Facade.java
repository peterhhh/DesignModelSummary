package facade_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 09:18
 */

public class Facade {
    private Circle circle;
    private Rectangle rectangle;


    public Facade(){
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
