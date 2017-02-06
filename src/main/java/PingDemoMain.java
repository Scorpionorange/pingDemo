/**
 * Created by ScorpionOrange on 2017/02/06.
 */
public class PingDemoMain {
    public static void main(String[] args) throws Exception {
        //String url = "https://zhuanlan.zhihu.com/p/25070515";
        //System.out.println("now testing: " + url);
        //System.out.println("Using Ping Method: " + new PingDemo().ping(url));
        //System.out.println("Using Url Method: " + new PingDemo().isUrlExists(url));

        String ApartUrl = "https://zhuanlan.zhihu.com/p/";
        for(long i = 25070000; i <= 25071000; i++){
            String BpartUrl = ApartUrl + i;
            System.out.println(BpartUrl + "   ///   " + new PingDemo().isUrlExists(BpartUrl));
        }
    }
}
