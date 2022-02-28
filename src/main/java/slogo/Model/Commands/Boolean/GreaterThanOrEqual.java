package slogo.Model.Commands.Boolean;

import slogo.Model.ModelExceptions;
import slogo.Model.Turtle;

public class GreaterThanOrEqual extends BooleanOperation{

  public GreaterThanOrEqual(double[] values) {
    super(values);
  }

  @Override
  public double execute(Turtle turtle) throws ModelExceptions {
    if(areSame(getParams()[0],getParams()[1])){
      return 1.0;
    }
    else if (getParams()[0]>getParams()[1]){
      return 1.0;
    }
    else{return 0.0;}
  }

}
