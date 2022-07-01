package sdf.test;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;



public class Client {

    private static final String SERVER_IP = "68.183.239.26";
    private static final int SERVER_PORT = 80;


    public static void main( String[] args ) throws UnknownHostException, IOException{
     
        Socket socket = new Socket("68.183.239.26", 80);


        /* SETTING A CONNECTION TIMEOUT TO 15 SECONDS*/
        socket.connect(new InetSocketAddress(SERVER_IP ,SERVER_PORT),15000); 
        
        

        //1. get output stream followed by input stream
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());
        DataInputStream is = new DataInputStream(socket.getInputStream());
       
        String strings = is.readUTF(); // can't connect
        System.out.println("Connected...");


        String[] req = strings.split(","); // split the response from server
     
     
        ObjectOutputStream objos = new ObjectOutputStream(os);
        ObjectInputStream  objis = new ObjectInputStream(is);

        objos.writeUTF(req[0]);
        objos.flush();

        Console cons = System.console();
        String input = "S12345678";
         objos.writeUTF(input);
         objos.flush();
         String email = "38@GMAIL.COM";
         objos.writeUTF(email);
         objos.flush();
         objos.writeFloat(Avg.average(req));
         objos.flush();

        
         if(objis.read() = true){

            System.out.println("SUCCESS");

            socket.close();
         }
         else {

            String error = objis.readUTF();
            System.out.println(error);
            System.out.println("FAILED");
            socket.close();



         
         }
        
    }
}


        

        
