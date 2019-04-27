package proxy_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 10:02
 */

public class ProxyImage implements Image {

    private RealImage realImage;

    public ProxyImage(RealImage realImage){
        this.realImage = realImage;
    }

    @Override
    public void draw() {
        realImage.draw();
    }
}
