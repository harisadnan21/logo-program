package slogo.View.Panels.Info;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import slogo.View.Panels.Canvas.CanvasView;
import slogo.View.ViewListener;
import slogo.View.ViewPublisher;

public class BackgroundColorPane extends SideTitledPane {

  private ColorPicker colorPicker;
  private ViewPublisher vp;

  public BackgroundColorPane(VBox sideInput, CanvasView canvasView){
    super(sideInput);

    colorPicker = new ColorPicker();
    vp = new ViewPublisher();
    vp.addObserver(canvasView);

    setUpColorPane();
    setUpColorGrid();

  }

  private void setUpColorPane(){

    getPane().setText("Background Colors");
    getPane().setId("backgroundColorPane");


  }

  private void setUpColorGrid(){

    getGridPane().add(colorPicker, 0, 1);
    colorPicker.setOnAction(new EventHandler() {
      public void handle(Event t) {
        Color c = colorPicker.getValue();
        vp.updateColor(c);
      }
    });

  }




  @Override
  protected void addPane() {

  }

  @Override
  protected void addVariable(int variable) {

  }


}
