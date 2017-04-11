// Omar Rodriguez
// CS 380
// Professor Nima Davarpanah

import java.io.*;
import java.net.*;
import java.util.*;

public class Listener implements Runnable {

  Socket socket;

  public Listener(Socket socket) {
    super();
    this.socket = socket;
  }

  public void run() {
    try  {
      InputStream is = socket.getInputStream();
      InputStreamReader isr = new InputStreamReader(is, "UTF-8");
      BufferedReader br = new BufferedReader(isr);

      while (true) {

        System.out.println(br.readLine());

      }
    }
    catch (Exception e) {
      System.out.print(e);
    }
  }
}
