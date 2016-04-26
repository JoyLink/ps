package cs601.ps.ops;

import cs601.ps.PSInterpreter;
import cs601.ps.objects.PSDictionary;
import cs601.ps.objects.PSObject;

/**
 * Created by xyz on 2/15/15.
 */
public class begin extends PSOperator {

    @Override
    public void execute(PSInterpreter interpreter) {
          PSObject pso = interpreter.operandStack.pop();
          if(pso instanceof PSDictionary) {
              interpreter.dictionaryStack.push((PSDictionary)pso);
          }
          else {
              interpreter.operandStack.push(pso);
          }
    }
}
