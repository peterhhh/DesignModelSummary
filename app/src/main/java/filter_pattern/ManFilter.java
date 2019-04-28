package filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingbin
 * @date 2019/4/25 14:53
 */

public class ManFilter implements Filter {

    @Override
    public List<Person> filterPersons(List<Person> list) {
        List<Person> manList = new ArrayList<>();
        for (Person person : list) {
            if (person.getSex()==1){
                manList.add(person);
            }
        }
        return manList;
    }
}
