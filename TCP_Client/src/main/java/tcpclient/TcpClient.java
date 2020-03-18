package tcpclient;


import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TcpClient {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("localhost", 6789);
        
        OutputStream outputstream=socket.getOutputStream();
        DataOutputStream dataoutputstream=new DataOutputStream(outputstream);
        outputstream.write("salam server ,necesen?".getBytes());
        socket.close();
    }
}
