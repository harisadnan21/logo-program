package slogo.View.APIs;

import java.lang.reflect.InvocationTargetException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public interface ViewAPI {


  void clearHistory();


  void sendFileContents(String fileContent)
      throws Exception;
}


