package javaRepeat.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class DemoSocket {

    public static void main(String[] args) throws IOException {
        sendRequest("localhost", 8189, "GET");
        sendRequest("localhost", 8189, "POST");
    }

    public static void sendRequest(String host, int port, String method) throws IOException {
        Socket socket = new Socket(host, port);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(method).append(" ").append("/hello HTTP/1.1").append("\r\n");
        stringBuilder.append("Host: ").append(host).append(":").append(port).append("\r\n");
        stringBuilder.append("Accept: ").append("text/plain;charset=UTF-8").append("\r\n");
        stringBuilder.append("Connection: ").append("close").append("\r\n");
        stringBuilder.append("Content-type: ").append("text/plain;charset=UTF-8").append("\r\n");
        stringBuilder.append("\r\n");

        socket.getOutputStream().write(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
        socket.getOutputStream().flush();

        backRequest(socket.getInputStream());
    }

    public static void backRequest(InputStream input) throws IOException {
        System.out.println(".........................");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        }
        System.out.println(".........................");
    }

}
