package flyweight_pattern;

import java.util.HashMap;

/**
 * @author dingbin
 * @date 2019/3/27 17:32
 * 将外部状态color作为map的key，这样就能通过color这个固有值取获取对象了，最主要的还是通过map把对象保存进去吧
 */

public class ShapeFactory {

    private static HashMap<Integer,Circle> map = new HashMap<>();

    public static Circle getShape(int color){
        Circle shape = map.get(color);
        if (shape==null){
            shape = new Circle(color);
            map.put(color,shape);
            System.out.println("创建Circle "+color);
        }
        return shape;
    }
}
