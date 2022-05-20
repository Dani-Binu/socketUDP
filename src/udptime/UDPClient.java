/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udptime;

/**
 *
 * @author Daniele
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {

	public static void main(String[] args) {
            Client cli = new Client();
            cli.Leggi();
            cli.Scrivi();
            System.out.println("Connessione stabilita!");
            System.out.println("Data e ora del server: " + response);
            System.out.println("Connessione chiusa!");			
	}

}
