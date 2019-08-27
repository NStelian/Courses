package ro.itschool.mvnbase.curs23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Listener {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("10.0.0.113",1111);
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {

        }
    }
}
