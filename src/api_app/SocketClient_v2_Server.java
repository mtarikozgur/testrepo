package api_app;

import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Inet6Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import static java.lang.System.out;

public class SocketClient_v2_Server {

	public static void main(String[] args) {

		StringBuilder sb              = new StringBuilder();
		Scanner       inputStream, sc = new Scanner(System.in);
		PrintWriter   outputStream;
		ServerSocket  serverSocket;
		out.println("Enter description of client user:");
		{
			String line = sc.nextLine();
			do {
				sb.append(line).append('\n');
				line = sc.nextLine();
			} while (!line.isBlank());
		}
		
		try {
			//Wait for connection on port 6789
			out.println(Inet6Address.getLocalHost());
			out.println("Waiting for a connection.");
			serverSocket = new ServerSocket(6789);
			Socket socket = serverSocket.accept();
			inputStream  = new Scanner(new InputStreamReader(socket.getInputStream()));
			outputStream = new PrintWriter(new DataOutputStream(socket.getOutputStream()));
			String name = inputStream.nextLine();// Read name from the client
			outputStream.print("Well, " + name + ' '); // Output text to the client
			outputStream.println(sb);
			outputStream.flush();
			inputStream.close();
			outputStream.close();
		} catch (Exception e) {
			out.println("Error" + e);
		}

	}

}
