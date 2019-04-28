package flyweight_pattern;

/**
 * @author dingbin
 * @date 2019/3/27 17:40
 */

public class Test {
    private static int[] colors = new int[]{0,2,3,5,7,9,100};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Circle shape = ShapeFactory.getShape(getRandomColor());
            shape.setX(getRandomX());
            shape.setY(getRandomY());
            shape.draw();
        }

    }

    public static int getRandomColor(){
       return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
