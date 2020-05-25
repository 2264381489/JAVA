package TEST;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class testDay25 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("DESKTOP-K1BEEKT");
        byte[] address = byName.getAddress();
        InetAddress byAddress = InetAddress.getByAddress(address);
        System.out.println(byAddress);
    }
}
