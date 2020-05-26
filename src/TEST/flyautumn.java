package TEST;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

import java.util.*;
public class flyautumn {
    Socket socket;
    OutputStream outputStream;
//    FileInputStream fileInputStream;

    /**
     * 开启发送方式
     * @param path
     * @throws Exception
     */
    public void send(String path) throws Exception {

        //开启socket
        socket = new Socket(InetAddress.getLocalHost(), 2425);
        //用socket开启输出字节流
        outputStream = socket.getOutputStream();
        //将从文件获取输入字节
        byte[] bytes = path.getBytes();
        //文件输入开始读取

            //第二个是偏移,输出字节流开始写入.
            outputStream.write(bytes,0,bytes.length);

        close();
    }

    /**
     * 关闭方式
     * @throws Exception
     */
    private void close() throws Exception {
//        fileInputStream.close();
        outputStream.close();
        socket.close();

    }

    public static void main(String[] args) throws Exception {
        flyautumn sendDay26 = new flyautumn();
        sendDay26.send("version:"+new Date().toString()+"发送人ip"+InetAddress.getLocalHost()+"flag content1.0:毫秒时间123,123,123,123:32你好");
        sendDay26.close();

    }
}
