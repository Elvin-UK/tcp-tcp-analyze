/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author User
 */
public class TcpServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        ServerSocket ourfirstserversocket=new ServerSocket(6789);
        
        while(true){
            Socket connection=  ourfirstserversocket.accept();
            System.out.println("bura gelmeyecek");
            InputStream is=  connection.getInputStream();
            InputStreamReader reader=new InputStreamReader(is);
            BufferedReader bReader=new BufferedReader(reader);
            
            
           String messagefromClient= bReader.readLine();
            System.out.println("message=="+messagefromClient);
         
        }
        
//          String clientSentence;
//  String capitalizedSentence;
//  ServerSocket welcomeSocket = new ServerSocket(6789);
//
//  while (true) {
//   Socket connectionSocket = welcomeSocket.accept();
//   BufferedReader inFromClient =
//    new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
//   DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
//   clientSentence = inFromClient.readLine();
//   System.out.println("Received: " + clientSentence);
//   capitalizedSentence = clientSentence.toUpperCase() + 'n';
//   outToClient.writeBytes(capitalizedSentence);
//  }
    }
    
}
