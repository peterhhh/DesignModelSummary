package filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingbin
 * @date 2019/4/25 14:55
 */

public class WomenFilter implements Filter {
    @Override
    public List<Person> filterPersons(List<Person> list) {
        List<Person> womenList = new ArrayList<>();
        for (Person person : list) {
            if (person.getSex()==0){
                womenList.add(person);
            }
        }
        return womenList;
    }
}
