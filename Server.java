import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(4444);
    System.out.println("Waiting...");
    Socket socket = server.accept();
    System.out.println("connect from " + socket.getInetAddress());
    InputStream input = socket.getInputStream();
    System.out.println(input.read());
    server.close();
    input.close();
    socket.close();
  }
}
