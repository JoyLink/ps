package cs601.ps.objects;

/**
 * Created by xyz on 2/15/15.
 */
public class PSInt extends PSNumber {
    public PSInt(String intStr) {
        super(new Integer(intStr));
    }
    public PSInt(Integer f) {
        super(new Integer(f));
    }

    @Override
    public float floatValue() {
        return ((Integer) getJavaValue()).floatValue();
    }

    @Override
    public int intValue() {
        return ((Integer)value).intValue();
    }
}