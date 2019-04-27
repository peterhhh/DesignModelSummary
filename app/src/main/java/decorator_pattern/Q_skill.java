package decorator_pattern;

/**
 * @author dingbin
 * @date 2019/4/25 16:50
 */

public class Q_skill extends Skills {
    String skillName;
    public Q_skill(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        super.learnSkills();
        System.out.print("学习了Q "+skillName);
    }
}
