import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatServer {
    private static final int PORT = 12345;
    private static ArrayList<Socket> clients = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                clients.add(clientSocket);
                System.out.println("New client connected: " + clientSocket.getInetAddress());

                handleClient(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try {
            Scanner input = new Scanner(clientSocket.getInputStream());
            OutputStream output = clientSocket.getOutputStream();

            output.write("Welcome! Type your message:\n".getBytes());

            while (input.hasNextLine()) {
                String message = input.nextLine();
                System.out.println("Client: " + message);
                output.write(("Server: " + message + "\n").getBytes()); // Echo message back
            }

            input.close();
            clientSocket.close();
            clients.remove(clientSocket);
            System.out.println("Client disconnected.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
