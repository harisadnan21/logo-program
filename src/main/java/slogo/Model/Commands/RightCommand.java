package slogo.Model.commands;

import slogo.Control.TurtleManager;

public class RightCommand extends Command {

  public RightCommand(double[] values, TurtleManager manager){
    super(values, manager);
  }

  public double execute(){
    getManager().getCurrentTurtle().setAngle(getManager().getCurrentTurtle().getAngle() + getParams()[0]);
    return getParams()[0];
  }
}
