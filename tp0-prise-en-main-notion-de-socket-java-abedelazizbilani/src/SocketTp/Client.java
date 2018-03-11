/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketTp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Abed Bilani
 */
public class Client {

    static int port = 4444;

    public static void main(String[] args) throws IOException {

        Socket client = new Socket("127.0.0.1", port);
        Scanner litClient = new Scanner(System.in);
        Scanner litServeur = new Scanner(client.getInputStream());
        
        System.out.println("envoyer une message");
        String message = litClient.nextLine();
        PrintStream p = new PrintStream(client.getOutputStream());
        p.println(message);
        String messageServeur = litServeur.nextLine();
        System.out.println(messageServeur);
    }
}
