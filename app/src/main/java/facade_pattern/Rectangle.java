package facade_pattern;

import facade_pattern.Shape;

/**
 * @author dingbin
 * @date 2019/4/26 09:17
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.print("draw rectangle");

    }
}
