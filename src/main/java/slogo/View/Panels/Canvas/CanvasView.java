package slogo.View.Panels.Canvas;

import java.util.ResourceBundle;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import slogo.View.Observer.ViewListener;


public class CanvasView implements ViewListener {

  private StackPane canvasBox;
  private Canvas turtleCanvas;
  private GraphicsContext gc;
  private ResourceBundle myResources;

  private final int CANVAS_DIMENSIONS;

  public CanvasView(StackPane outerPane, ResourceBundle resources) {


    myResources = resources;
    canvasBox = outerPane;
    CANVAS_DIMENSIONS = Integer.parseInt(myResources.getString("CanvasDimensions"));
    turtleCanvas = new Canvas(CANVAS_DIMENSIONS, CANVAS_DIMENSIONS);
    gc = turtleCanvas.getGraphicsContext2D();
    setupCanvas(gc);
    canvasBox.getChildren().addAll(turtleCanvas);


  }

  private void setupCanvas(GraphicsContext gc){
    gc.setFill(Color.WHITE);
    gc.fillRect(0, 0, CANVAS_DIMENSIONS, CANVAS_DIMENSIONS);

  }

  public Canvas getTurtleCanvas(){
    return turtleCanvas;
  }

  public GraphicsContext getContext(){
    return gc;
  }

  public void clearCanvas(){
    gc.clearRect(0, 0, getTurtleCanvas().getHeight(), getTurtleCanvas().getWidth());
    gc.setFill(Color.WHITE);
    gc.fillRect(0, 0, CANVAS_DIMENSIONS, CANVAS_DIMENSIONS);
  }


  @Override
  public void updateCanvas(Color colorInput) {
    gc.setFill(colorInput);
    gc.fillRect(0, 0, CANVAS_DIMENSIONS, CANVAS_DIMENSIONS);
  }

  @Override
  public void updatePen(Color colorInput) {

  }



}
