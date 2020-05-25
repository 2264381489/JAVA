package TEST;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.*;

public class homewirkDay25 {

    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        DatagramSocket datagramSocket = new DatagramSocket();
//        //创建字符串数据
//        String s="nihao";
        File file = new File("C:\\Users\\22643\\Desktop\\JAVA\\src\\TEST\\book.txt");
        //转换成byte类型数据
//        byte[] bytes = file.getBytes();
        //创建文件
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes=new byte[1024];
        while(fileInputStream.read(bytes)!=-1){
            System.out.println("cunzai");
            //打包byte信息
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("DESKTOP-K1BEEKT"), 8080);
            //调用dategramSocket得返送方法
            datagramSocket.send(datagramPacket);

        }
        /**
         * buf - 数据包数据。
         * length - 包长度。
         * address - 目的地址。
         */
//        //打包byte信息
//        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("DESKTOP-K1BEEKT"), 8080);
//        //调用dategramSocket得返送方法
//        datagramSocket.send(datagramPacket);
        //关闭
        datagramSocket.close();
    }
}
