package prototype_pattern;

/**
 * @author dingbin
 * @date 2019/3/29 11:29
 */

public abstract class Shape implements Cloneable {

    protected String type;
    private int id;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
