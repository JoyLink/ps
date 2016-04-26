package cs601.ps.ops;

import cs601.ps.PSInterpreter;

/**
 * Created by xyz on 2/15/15.
 */
public class end extends PSOperator {

    @Override
    public void execute(PSInterpreter interpreter) {
        interpreter.dictionaryStack.pop();
    }
}
