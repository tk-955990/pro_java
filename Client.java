import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

class Client {
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("localhost", 4444);
    OutputStream output = socket.getOutputStream();
    output.write(234);
    output.close();
    socket.close();
  }
}
