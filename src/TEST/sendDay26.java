package TEST;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class sendDay26 {
    Socket socket;
    OutputStream outputStream;
    FileInputStream fileInputStream;

    /**
     * 开启发送方式
     * @param path
     * @throws Exception
     */
    public void send(String path) throws Exception {
        //开启socket
        socket = new Socket(InetAddress.getLocalHost(), 8080);
        //用socket开启输出字节流
        outputStream = socket.getOutputStream();
        //将从文件获取输入字节
        fileInputStream = new FileInputStream(new File(path));
        byte[] bytes = new byte[1024];
        //文件输入开始读取
        while((fileInputStream.read(bytes))!=-1){
            //第二个是偏移,输出字节流开始写入.
            outputStream.write(bytes,0,bytes.length);
        }
        close();
    }

    /**
     * 关闭方式
     * @throws Exception
     */
    private void close() throws Exception {
        fileInputStream.close();
        outputStream.close();
        socket.close();
    }

    public static void main(String[] args) throws Exception {
        sendDay26 sendDay26 = new sendDay26();
        sendDay26.send("C:\\Users\\22643\\Desktop\\JAVA\\src\\TEST\\book.txt");
        sendDay26.close();

    }
}
