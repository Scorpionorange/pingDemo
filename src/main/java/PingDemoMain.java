/**
 * Created by ScorpionOrange on 2017/02/06.
 */
public class PingDemoMain {
    public static void main(String[] args) throws Exception {
        String url = "https://www.baidu.com";
        System.out.println("now testing: " + url);
        //System.out.println("Using Ping Method: " + new PingDemo().ping(url));
        System.out.println("Using Url Method: " + new PingDemo().isUrlExists(url));
    }
}
