
package sockets;

import java.io.IOException;
import java.io.OutputStream;  import java.net.InetAddress;  import java.net.Socket;
import java.util.Scanner;

public class cliente {

  public static final void main(final String[] args) {
    Socket        client;
    OutputStream  os;
    InetAddress   ia;
    Scanner entrada=new Scanner(System.in);

    try {
      ia = InetAddress.getByName("localhost");//get local host address
     
      client = new Socket(ia, 9999); //create socket (*@\clientBox{1+2)}@*)
     
      os = client.getOutputStream();
     
      int number=0;
      while (number>=20 || number<=0)
      { System.out.println("Ingrese un numero");
      number = entrada.nextInt();
     
      os = client.getOutputStream(); //conseguir que la corriente escriba
     
      }
      os.write(number);  //write one byte of value 1 (*@\clientBox{3)}@*)
     
      client.close(); //close (*@\clientBox{4)}@*)
    } catch (IOException t) {
    }
  }
}
