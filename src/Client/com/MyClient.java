package Client.com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Connexion au serveur...");
		Socket s = new Socket("localhost", 1234);
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		System.out.println("Saisir un nombre");
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		os.write(nb);
		System.out.println("Attendre la reponse du serveur");
		int rep = is.read();
		System.out.println("La reponse est :" + rep);
		s.close();

	}

}
