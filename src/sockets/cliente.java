/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.IOException;
import java.io.OutputStream;  import java.net.InetAddress;  import java.net.Socket;

public class cliente {

  public static final void main(final String[] args) {
    Socket        client;
    OutputStream  os;
    InetAddress   ia;

    try {
      ia = InetAddress.getByName("10.42.0.1");//get local host address
      
      client = new Socket(ia, 9999); //create socket (*@\clientBox{1+2)}@*)
      
      os = client.getOutputStream(); //get stream to write to
      os.write(1);  //write one byte of value 1 (*@\clientBox{3)}@*)
      
      client.close(); //close (*@\clientBox{4)}@*)
    } catch (IOException t) {
    }
  }
}
