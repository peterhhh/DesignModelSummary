package iterator_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 14:46
 */

public class NameIterator implements Iterator {
    public String[] name = new String[]{"john","ding","pupu","jomi"};
    int index = 0;

    @Override
    public boolean hasNext() {
        if (index<name.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()){
            return name[index++];
        }
        return null;
    }
}
