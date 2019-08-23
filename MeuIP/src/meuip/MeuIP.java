/**
 * Meu IP main class.
 */
package meuip;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Main class. Initialize controller.
 * 
 * @author Daniel Augusto Monteiro de Almeida
 * @since 02/18/2019
 * @version 1.0.1-190823-12
 * 
 * Changelog: 
 * Reformatting to adjust to correct
 * standards.
 * Javadoc finished.
 * 
 */
public class MeuIP extends Application 
{
    
  @Override
  public void start(Stage stage) throws Exception 
  {
    Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    Scene scene = new Scene(root);
    stage.getIcons().add(new Image(MeuIP.class.getResourceAsStream("icon.png")));
    stage.setTitle("Meu IP");
    stage.setResizable(false);
    stage.setScene(scene);
    stage.show();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {  launch(args); }
    
}


