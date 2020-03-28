package cn.microanswer;

import org.junit.Test;

public class HttpUtilTest {

    @Test
    public void test1 () throws Exception{
        long s = System.currentTimeMillis();
        System.out.println(HttpUtil.get("https://www.microanswer.cn"));
        System.out.println("耗时：" +( System.currentTimeMillis() - s) + "毫秒");
    }
}
