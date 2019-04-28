package filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingbin
 * @date 2019/4/25 14:58
 */

public class Test {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("dingbin",21,1));
        list.add(new Person("mary",23,1));
        list.add(new Person("john",27,1));
        list.add(new Person("peter",23,0));
        list.add(new Person("josh",21,1));
        list.add(new Person("smith",21,1));
        list.add(new Person("dingbin",91,0));
        list.add(new Person("dingbin",21,0));
        list.add(new Person("dingbin",51,1));

        ManFilter manFilter = new ManFilter();
        manFilter.filterPersons(list);

        WomenFilter womenFilter = new WomenFilter();
        womenFilter.filterPersons(list);
    }
}
