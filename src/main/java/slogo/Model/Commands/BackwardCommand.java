package slogo.Model.Commands;

import slogo.Model.ModelExceptions;
import slogo.Model.Turtle;

public class BackwardCommand extends Command {
  public BackwardCommand(double[] values){
    super(values);
  }

  @Override
  public double execute(Turtle turtle) throws ModelExceptions {
    double angle = turtle.getAngle();
    double newXpos = turtle.getTurtleX() - getParams()[0] * Math.cos(Math.toRadians(angle));
    double newYpos = turtle.getTurtleY() - getParams()[0] * Math.sin(Math.toRadians(angle));
    turtle.changeTurtleLocation(newXpos, newYpos);
    return getParams()[0];
  }
}