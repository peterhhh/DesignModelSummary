package prototype_pattern;

import java.util.Hashtable;

import prototype_pattern.Circle;
import prototype_pattern.Rectangle;
import prototype_pattern.Shape;
import prototype_pattern.Square;

/**
 * @author dingbin
 * @date 2019/3/29 11:34
 */

public class ShapeFactory {

    private static Hashtable<String, Shape> hashtable = new Hashtable<>();

    private static Shape getShape(String type){
        Shape shape = hashtable.get(type);
        if (shape!=null){
            return (Shape) shape.clone();

        }
        return null;
    }
    private static void load(){
        Circle circle = new Circle("circle");
        hashtable.put(circle.getType(),circle);

        Rectangle rectangle = new Rectangle("rectangle");
        hashtable.put(rectangle.getType(),rectangle);

        Square square = new Square("square");
        hashtable.put(square.getType(),square);
    }


    public static void main(String[] args) {
        load();
        Shape shape = getShape("square");
        if (shape!=null){
            System.out.println(shape.getType());
        }


        Shape shape3 = getShape("rectangle");
        if (shape3!=null){
            System.out.println(shape3.getType());
        }


    }
}
