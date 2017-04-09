// Omar Rodriguez
// CS 380
// Professor Nima Davarpanah

import java.io.*;
import java.net.*;
import java.util.*;

public final class ChatClient {

  public static void main(String[] args) throws Exception {

    try (Socket socket = new Socket("codebank.xyz", 38001)) {

      Listener listener = new Listener(socket);
      Thread thread = new Thread(listener);

      thread.start();

      Scanner kb = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String in = kb.nextLine();

      PrintStream out = new PrintStream(socket.getOutputStream(), true, "UTF-8");

      out.println(in);

      while(true) {

        in = kb.nextLine();
        out.println(in);
        Thread.sleep(500);

      }
    }
  }
}
