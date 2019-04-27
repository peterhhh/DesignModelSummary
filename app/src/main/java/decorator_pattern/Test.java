package decorator_pattern;

/**
 * @author dingbin
 * @date 2019/4/25 16:53
 */

public class Test {
    public static void main(String[] args) {

        Hero xiazi = new Xiazi();

        Skills skills = new Skills(xiazi);

        Q_skill q_skill = new Q_skill(skills,"天音波");
        q_skill.learnSkills();

    }
}
