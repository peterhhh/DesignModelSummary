package decorator_pattern;

/**
 * 技能栏，对英雄的扩展
 * @author dingbin
 * @date 2019/4/25 16:49
 */

public class Skills implements Hero {

    Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if (hero!=null){
            hero.learnSkills();
        }
    }
}
