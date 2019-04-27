package template_pattern;

/**
 * @author dingbin
 * @date 2019/4/27 15:09
 */

public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("Basketball初始化");
    }

    @Override
    void startPlay() {
        System.out.println("开始玩Basketball");

    }

    @Override
    void gameOver() {
        System.out.println("Basketball gg");

    }
}
