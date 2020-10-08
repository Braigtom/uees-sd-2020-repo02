package sockets;

import java.io.IOException;
import java.io.InputStream;   import java.net.ServerSocket;   import java.net.Socket;

public class servidor {
  public static final void main(final String[] args) throws IOException {
    ServerSocket server;           InputStream  is;
    Socket       client;          

    try {
      server = new ServerSocket(9999);//(*@\serverBox{1 + 2)}@*)
     
      for (int j = 5; (--j) >= 0;) {  //process only 5 clients, so I can show (*@\serverBox{5)}@*) below
        client = server.accept(); //wait for incoming connection (*@\serverBox{3)}@*)
        System.out.println("New connection from " + client.getRemoteSocketAddress());
       
        is     = client.getInputStream();//get stream to read from
       
        int var=(int) is.read();
        System.out.println(var);//(*@\serverBox{4} + \clientBox{3})@*)
           
        if(var<=20 &&var>=1)
        {
            for (int i =0; i< var;i++)
            {
                System.out.println("X");
            }
            System.out.println(" ");
        }
        client.close(); //close connection to client
      }
      server.close();  
    
    server.close();
    } catch (IOException t) {
    }
  }
}

