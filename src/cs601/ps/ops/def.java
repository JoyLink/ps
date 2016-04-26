package cs601.ps.ops;

import cs601.ps.PSInterpreter;
import cs601.ps.objects.PSObject;

/**
 * Created by xyz on 2/15/15.
 */
public class def extends PSOperator {
    @Override
    public void execute(PSInterpreter interpreter) {
        //interpreter.operandStack.pop();
        PSObject y = interpreter.operandStack.pop();
        PSObject x = interpreter.operandStack.pop();
        interpreter.define(x.toString(), y);
    }
}
