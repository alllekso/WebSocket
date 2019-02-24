import lex.Phone;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (
                Phone phone = new Phone("127.0.0.1", 8000);

        ) {
            System.out.println("Connected to server");
            String request = "Kharkiv";
            phone.writeLine(request);
            System.out.println("Request:\n" + request);
            String response = phone.readLine();
            System.out.println("Response: \n" + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
