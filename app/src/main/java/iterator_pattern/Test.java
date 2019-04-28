package iterator_pattern;

/**
 * @author dingbin
 * @date 2019/4/26 15:05
 */

public class Test {

    public static void main(String[] args) {
        NameResponsity nameResponsity = new NameResponsity();
        for (Iterator iterator = nameResponsity.getIterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
