package filter_pattern;

import java.util.List;

/**
 * 过滤方法的统一接口
 * @author dingbin
 * @date 2019/4/25 14:52
 */

public interface Filter {

    List<Person> filterPersons(List<Person> list);

}
