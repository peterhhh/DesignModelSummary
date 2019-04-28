package proxy_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 10:01
 */

public class RealImage implements Image {
    @Override
    public void draw() {
        System.out.print("readlimage");

    }
}
