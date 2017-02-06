import java.net.InetAddress;

/**
 * Created by ScorpionOrange on 2017/02/06.
 */
public class PingDemo {
    public boolean ping(String ipAddress) throws Exception{
        int timeOut = 3000;
        //当返回值是true时，说明host是可用的，false则为不可
        boolean status = InetAddress.getByName(ipAddress).isReachable(timeOut);
        return status;
    }
}
