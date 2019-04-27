package proxy_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author dingbin
 * @date 2019/4/26 10:04
 */

public class Test {

    public static void main(String[] args) {
        RealImage realImage = new RealImage();
        //ProxyImage proxyImage = new ProxyImage(realImage);
        //proxyImage.draw();

        Image image = (Image) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Image.class}, new MyHandler(realImage));
        image.draw();
    }


    static class MyHandler implements InvocationHandler {

        private Image image;

        public MyHandler(Image image) {
            this.image = image;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return method.invoke(image,args);
        }
    }
}
