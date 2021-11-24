package server.com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss = new ServerSocket(1234);
			System.out.println("j'attend le client...");
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			System.out.println("j'attend les donnés envoyer par le client");
			int nb = is.read();
			int res = nb * 2;
			os.write(res);
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
