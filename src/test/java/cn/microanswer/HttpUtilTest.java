package cn.microanswer;

import org.junit.Test;

public class HttpUtilTest {

    @Test
    public void test1 () throws Exception{
        long s = System.currentTimeMillis();
        System.out.println(HttpUtil.download("http://file.microanswer.cn/blog_43_1.jpg?attname=%E5%8D%A7%E6%A7%BD.jpg", "D:\\"));
        System.out.println("耗时：" +( System.currentTimeMillis() - s) + "毫秒");
    }
}
