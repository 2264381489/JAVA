package TEST;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class flayautumnrecieve {
    public static void main(String[] args) throws IOException {
        System.out.println("开始运行");
        ServerSocket serverSocket = new ServerSocket(2425);
        Socket socket = serverSocket.accept();//1.返回发送端的socket对象，2.此方法阻塞
        System.out.println("开始接受");
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];

        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,bytes.length));
//        FileOutputStream fileOutputStream  =new FileOutputStream(new File("C:\\Users\\22643\\Desktop\\JAVA\\src\\TEST\\2222.txt"),true);
//        byte[] buf = new byte[1024];
//        int length = 0;
//        while ((length = inputStream.read(buf)) !=-1) {
//            fileOutputStream.write(buf, 0, length);
//        }
//        fileOutputStream.close();
//        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
