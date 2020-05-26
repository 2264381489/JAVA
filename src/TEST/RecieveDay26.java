package TEST;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class RecieveDay26 {
    public static void main(String[] args) throws IOException {
        System.out.println("开始运行");
        ServerSocket serverSocket = new ServerSocket(2425);
        Socket socket = serverSocket.accept();//1.返回发送端的socket对象，2.此方法阻塞
        System.out.println("开始接受");
        InputStream inputStream = socket.getInputStream();
        FileOutputStream fileOutputStream  =new FileOutputStream(new File("C:\\Users\\22643\\Desktop\\JAVA\\src\\TEST\\2222.txt"),true);
        byte[] buf = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buf)) !=-1) {
            fileOutputStream.write(buf, 0, length);
        }
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
