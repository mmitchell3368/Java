package CA;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	
	private Socket socket;
	private BufferedReader br; 
	private BufferedWriter bw;
	private String username;
	
	public Client(Socket socket, String username) {
		try {
			this.socket = socket;
			this.bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.username = username;
		} catch (IOException e) {
			closeEverything(socket, br, bw);
		}
	}

	public void sendMessage() {
		try {
			bw.write(username);
			bw.newLine();
			bw.flush();
			
			Scanner sc = new Scanner(System.in);
			while (socket.isConnected()) {
				String messageToSend = sc.nextLine();
				bw.write(username + ": " + messageToSend);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			closeEverything(socket, br, bw);
		}
	}
	
	public void listenForMessage() {
		new Thread(new Runnable() {
			@Override 
			public void run() {
				String msgFromGroupChat;
				
				while (socket.isConnected()) {
					try {
						msgFromGroupChat = br.readLine();
						System.out.println(msgFromGroupChat);
					} catch (IOException e) {
						closeEverything(socket, br, bw);
					}
				}
			}
		}).start();
	}
	
	public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
		try {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}
			if (socket != null) {
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your username for the groupchat: ");
		String username = sc.nextLine();
		Socket socket = new Socket("localhost", 1234);
		Client client = new Client(socket, username);
		client.listenForMessage();
		client.sendMessage();
	}
}

