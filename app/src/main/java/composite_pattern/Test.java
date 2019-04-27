package composite_pattern;

/**
 * @author dingbin
 * @date 2019/4/25 15:31
 */

public class Test {

    public static void main(String[] args) {

        Employee ceo = new Employee("dingbin","top",100000);


        Employee xingzheng1 = new Employee("dingbin2","top2",200000);
        Employee xingzheng2 = new Employee("dingbin2","top2",200000);

        Employee caiwu1 = new Employee("dingbin3","top3",300000);
        Employee caiwu2 = new Employee("dingbin3","top3",300000);

        ceo.addSubordinate(xingzheng1);
        ceo.addSubordinate(xingzheng2);

        xingzheng1.addSubordinate(caiwu1);
        xingzheng2.addSubordinate(caiwu2);



    }

}
