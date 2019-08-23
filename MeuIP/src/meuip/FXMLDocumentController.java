/*
 * Meu IP Controller.
 */
package meuip;

import java.io.IOException;
import java.net.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * Main class. Implements interface.
 * 
 * @author Daniel Augusto Monteiro de Almeida
 * @since 02/18/2019
 * @version 1.0.1-190823-20
 * 
 * Changelog: 
 * Reformatting to adjust to correct
 * standards.
 * Javadoc finished
 * 
 */
public class FXMLDocumentController implements Initializable 
{
  /**
   * Interface object. TextField who
   * shows IP address.
   */
  @FXML
  private TextField campoip;
  
  /**
   * Interface object. TextField who
   * shows hostname.
   */
  @FXML
  private TextField campohost;

  /**
   * Action performed when button is clicked
   * @param event - generic button event
   * @throws IOException when hostname is null/empty
   */
  @FXML
  public void clickbutton (ActionEvent event) throws IOException
  {
    String ip = null;
    String host;
    try(final DatagramSocket socket = new DatagramSocket())
    {
      socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
      ip = socket.getLocalAddress().getHostAddress();
    } 
    catch (SocketException | UnknownHostException ex) {} // Exception in case not having connection
    InetAddress inetAddress = InetAddress.getLocalHost();
    host = inetAddress.getHostName();
    campoip.setText(ip);
    campohost.setText(host);
  }

  /**
   * Initialization method.
   * @param url - not used
   * @param rb - not used
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {}
    
}








