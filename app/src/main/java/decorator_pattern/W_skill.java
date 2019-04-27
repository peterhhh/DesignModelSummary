package decorator_pattern;

/**
 * @author dingbin
 * @date 2019/4/25 16:52
 */

public class W_skill extends Skills {

    String skillName;



    public W_skill(Hero hero,String skillNam) {
        super(hero);
        this.skillName = skillNam;
    }


    @Override
    public void learnSkills() {
        super.learnSkills();
        System.out.print("学习了W "+skillName);
    }
}
