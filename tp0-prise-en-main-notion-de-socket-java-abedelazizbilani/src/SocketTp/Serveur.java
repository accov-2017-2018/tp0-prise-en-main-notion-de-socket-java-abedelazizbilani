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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Abed Bilani
 */
public class Serveur {

    static int port = 4444;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String messageServeur, nouveauMessage;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket ss = serverSocket.accept();
        System.out.println("prêt à se connecter.....");

        Scanner sc = new Scanner(ss.getInputStream());
        messageServeur = sc.nextLine();
        nouveauMessage = "ping " + messageServeur;
        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(nouveauMessage);
    }

}
