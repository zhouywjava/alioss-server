
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.net.URLEncoder;


/**
 * @Description:
 * @Author: zyw
 * @Date: 2017/12/13
 */
public class HomeControllerTest {

    @Test
    public void indexTest() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8080/alioss/index");
        JSONObject jsonObject = new JSONObject();
        StringEntity stringEntity = new StringEntity(URLEncoder.encode(jsonObject.toJSONString(),"UTF-8"));
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String res = EntityUtils.toString(entity,"UTF-8");
        System.out.println(res);
    }
}
