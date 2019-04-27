package iterator_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 14:45
 */

public class NameResponsity implements Container {

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
