package cn.microanswer;

import org.junit.Test;

public class HttpUtilTest {

    @Test
    public void test1 () throws Exception{
        long s = System.currentTimeMillis();
        System.out.println(HttpUtil.postFormUrlEncode("http://baidu.com", null));
        System.out.println("耗时：" +( System.currentTimeMillis() - s) + "毫秒");
    }
}
