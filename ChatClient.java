// Omar Rodriguez
// CS 380
// Professor Nima Davarpanah

import java.io.*;
import java.net.*;
import java.util.*;

public final class ChatClient {

    public static void main(String[] args) throws Exception {
        try (Socket socket = new Socket("codebank.xyz", 38001)) {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            Scanner kb = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String in = kb.nextLine();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println(in);

            while(true) {
              System.out.print("");
              System.out.print("Send Message: ");
              //in = kb.nextLine();

            	   out.println(kb.nextLine());

            	System.out.println(br.readLine());
            }
        }
    }
}
