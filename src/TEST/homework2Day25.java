package TEST;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class homework2Day25 {
    public static void main(String[] args) throws IOException {
        //创建接收对象
        DatagramSocket datagramSocket = new DatagramSocket(8080);
    //接受数据得容器
        byte[] bytes = new byte[10*1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        //接收数据
        System.out.println("fasongle1");
        datagramSocket.receive(datagramPacket);
        //取出数据
        InetAddress address = datagramPacket.getAddress();
        byte[] data = datagramPacket.getData();
        File file = new File("C:\\Users\\22643\\Desktop\\JAVA\\src\\TEST\\tt.txt");
        if (file.exists()){
            System.out.println("创建成功");
        }
        //字符输出流?
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(data,0,data.length);
        fileOutputStream.flush();
        fileOutputStream.close();
//        System.out.println(address+"              "+new String(data,0,datagramPacket.getLength()));

    }
}
