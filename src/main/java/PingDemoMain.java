import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Created by ScorpionOrange on 2017/02/06.
 */
public class PingDemoMain {
    public static void main(String[] args) throws Exception {
        String url = "https://zhuanlan.zhihu.com/p/25070516";
        //System.out.println("now testing: " + url);
        //System.out.println("Using Ping Method: " + new PingDemo().ping(url));
        System.out.println("Using Url Method: " + new PingDemo().isUrlExists(url));

        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("*");
        Elements errorCode = elements.select("div.class").select("error-code");
        String state = errorCode.text();
        System.out.println(state);

        /*
        String url = "https://www.oschina.net/news";

        Document document = Jsoup.connect(url).get();

        Elements elements = document.select("#all-news");

        for (Element element : elements) {
            Elements titleElement = element.select("a[href]").select("class");
            String title = titleElement.text();
            String link = titleElement.attr("href").trim();

            Elements dataElement = element.select(".date");
            Elements authorElement = dataElement.select("a");
            String author = authorElement.text();
            authorElement.remove();
            String date = dataElement.text();
            String detail = element.select(".detail").text();

            System.out.println("���ӣ�        " + "http://www.oschina.net"+link);
            System.out.println("���⣺        " + title);
            System.out.println("���ߣ�        " + author);
            System.out.println("����ʱ�䣺 " + date);
            System.out.println("��ϸ��Ϣ�� " + detail);
            System.out.println();
            System.out.println();
        }
         */
    }
}
