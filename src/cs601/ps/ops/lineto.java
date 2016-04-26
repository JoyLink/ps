package cs601.ps.ops;

import cs601.ps.PSInterpreter;
import cs601.ps.objects.PSNumber;

/**
 * Created by xyz on 2/15/15.
 */
public class lineto extends PSOperator {
    @Override
    public void execute(PSInterpreter interpreter) {
        float dy = ((PSNumber)interpreter.pop()).floatValue();
        float dx = ((PSNumber)interpreter.pop()).floatValue();
        interpreter.gstate.currentPath.lineTo((int) dx, (int) dy);
        interpreter.gstate.lineto((int)dx, (int)dy);
    }
}
