package slogo.Control;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import slogo.Model.Commands.Command;
import slogo.Model.ModelExceptions;
import slogo.View.AnimationHandler;
import slogo.View.Panels.Canvas.CanvasView;
import slogo.View.Panels.Canvas.TurtleView;
import slogo.View.Panels.CanvasPanel;

public class Controller {
  private Translater parser;
  private TurtleManager manager;
  private AnimationHandler animation;
  public Controller(){
    parser = new Translater();
    manager = new TurtleManager();
    //animation = new AnimationHandler();
  }


  public void parseAndRunCommands(String contents, CanvasPanel panelInput)
      throws Exception {
    parser.parseText(contents);

    List<Command> commands = parser.getCommands();

    animation = new AnimationHandler(panelInput);
    for (Command command : commands){
      manager.stepTurtle(command);
      animation.createAnimation(manager.getRecordTurtle());
    }
  }

  public void parseAndRunCommandsNoView(String contents)
      throws Exception {
    parser.parseText(contents);

    List<Command> commands = parser.getCommands();

  //  animation = new AnimationHandler(panelInput);
    for (Command command : commands) {
      manager.stepTurtle(command);
//      animation.createAnimation(manager.getRecordTurtle());
    }
  }

  public List<Command> parseAndGetCommands(String contents)
      throws Exception {
    parser.parseText(contents);

    List<Command> commands = parser.getCommands();
    return commands;
  }
  public TurtleManager getTurtleManager(){
    return manager;
  }

//  private void updateStep(Command command) throws ModelExceptions {
//    manager.stepTurtle(command);
//    turtleView.updatePosition(manager.getRecordTurtle());
//
//  }

}
