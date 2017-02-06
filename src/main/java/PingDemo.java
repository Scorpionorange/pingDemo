import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.HttpURLConnection;

/**
 * Created by ScorpionOrange on 2017/02/06.
 */
public class PingDemo {
    public boolean ping(String url) throws IOException {
        boolean flag = false;
        Process process = Runtime.getRuntime().exec("ping " + url);
        InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
        LineNumberReader returnData = new LineNumberReader(inputStreamReader);

        String returnMsg = "";
        String line = "";
        while ((line = returnData.readLine()) != null){
            //System.out.println(line);
            returnMsg += line;
        }

        if (returnMsg.indexOf("100% loss") != -1){
            //System.out.println("与 " + address + " 无法连通！");
            flag = false;
        }
        else {
            //System.out.println("与 " + address + " 可以连通！");
            flag = true;
        }

        return flag;
    }

    public boolean isUrlExists(String url){
        boolean isExists = false;

        try{
            //设置此类是否应该自动执行HTTP重定向（响应代码为3xx的请求）；
            HttpURLConnection.setFollowRedirects(false);
        }

        return isExists;
    }
}
