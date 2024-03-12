import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("i'm UP");

        ServerSocket serverSocket = new ServerSocket(6379);

        Socket clientSocket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
        String line = in.readLine();
        System.out.println(line);
        while(!line.equals("ay")){
            line = in.readLine();
            System.out.println(line);
            if(line.equals("DOCS")){
                out.print("+OK\r\n");
            }
        }


        serverSocket.close();

    }
}