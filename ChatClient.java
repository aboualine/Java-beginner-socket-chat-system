import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             Scanner serverInput = new Scanner(socket.getInputStream());
             OutputStream output = socket.getOutputStream();
             Scanner userInput = new Scanner(System.in)) {

            System.out.println(serverInput.nextLine()); // Read welcome message

            while (true) {
                System.out.print("You: ");
                String message = userInput.nextLine();
                output.write((message + "\n").getBytes());

                if (serverInput.hasNextLine()) {
                    System.out.println(serverInput.nextLine()); // Read server response
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
