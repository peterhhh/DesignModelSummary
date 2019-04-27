package template_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 15:09
 */

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football初始化");

    }

    @Override
    void startPlay() {
        System.out.println("开始玩Football");

    }

    @Override
    void gameOver() {
        System.out.println("Football gg");

    }
}
