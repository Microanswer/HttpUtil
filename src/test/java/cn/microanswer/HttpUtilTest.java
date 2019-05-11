package cn.microanswer;

import org.junit.Test;

public class HttpUtilTest {

    @Test
    public void test1 () throws Exception{
        System.out.println(HttpUtil.get("http://baidu.com"));
    }
}
