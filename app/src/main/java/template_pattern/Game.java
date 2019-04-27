package template_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 15:06
 */

public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void gameOver();


    /**
     * final类型修饰的方法不能被重写，修饰的变量不能被修改、
     * 所以这个方法就相当于一个模板了，固定死了，子类如果调用这个方法，就比如按照这个执行顺序来
     */
    public final void play(){
        initialize();

        startPlay();

        gameOver();

    }

}
