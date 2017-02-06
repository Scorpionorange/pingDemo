/**
 * Created by ScorpionOrange on 2017/02/06.
 */
public class PingDemoMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Testing");
        String Address = "www.baidu.com";
        boolean is = new PingDemo().ping(Address);
        System.out.println();
    }
}
