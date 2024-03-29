package com.example;

import java.io.*;
import java.net.*;

public class WebClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 8080;
        long startTime = System.currentTimeMillis();
        try (Socket socket = new Socket(serverAddress, serverPort);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Connected to server");

            out.println("GET /index.html HTTP/1.1");
            out.println("Host: localhost");
            out.println();

            // Read the response from the server
            String responseLine;
            while ((responseLine = in.readLine()) != null) {
                System.out.println(responseLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long rtt = endTime - startTime;
        System.out.println("Round Trip Time (RTT): " + rtt + " ms");
    }
}
