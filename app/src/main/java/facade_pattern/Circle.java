package facade_pattern;

import facade_pattern.Shape;

/**
 * @author dingbin
 * @date 2019/4/26 09:16
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.print("draw circle");

    }
}
