package slogo.ModelTest.commandsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import slogo.Control.TurtleManager;
import slogo.Model.commands.Command;
import slogo.Model.ModelExceptions;
import slogo.Model.commands.*;

class RightCommandTest extends CommandTest {

  private double[] input = {45};
  private TurtleManager manager = new TurtleManager();

  @Override
  @Test
  void testExecute() throws ModelExceptions {
    Command rightCommand = new RightCommand(input);
    double initialAngle = manager.getCurrentTurtle().getAngle();
    rightCommand.execute(manager.getCurrentTurtle());
    double finalAngle = manager.getCurrentTurtle().getAngle();
    assertEquals(initialAngle + input[0] , finalAngle);
  }
}