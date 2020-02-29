# HttpUtil 网络请求工具类

网络请求工具，一个方法完成网络请求。本工具是依赖于 okhttp 进行的再一次封装，使每次网络请求代码更精简。欢迎大家提交issues或反馈bug及建议到
[Microanswer邮箱](mailto::microanswer@outlook.com)

<span style="color:red"> #注意：本工具类里所有方法均为同步方法。 </span>

## 安装

### maven 项目
```xml
<dependency>
    <groupId>cn.microanswer</groupId>
    <artifactId>HttpUtil</artifactId>
    <version>1.0.1</version>
</dependency>
```

### gradle 项目
```groovy
compile group: 'cn.microanswer', name: 'HttpUtil', version: '1.0.1'
```

### 下载 jar 包

[点击下载](http://central.maven.org/maven2/cn/microanswer/HttpUtil/1.0.1/HttpUtil-1.0.1.jar)

## 开始使用

```
// 使用 Get 请求
String responseString = HttpUtil.get("http://microanswer.cn");
```
```
// 下载文件到 指定目录
File downloadedFile = HttpUtil.download("http://microanswer.cn", new File("D:/"));
```
```
// 提交 POST 表单请求
HttpUtil.postFormUrlEncode("http://microanswer.cn/", null);
```
```
// 提交 POST JSON请求
HttpUtil.postApplicationJson("http://microanswer.cn/api/common.php", (JSONObject) null);
```
```
// 上传文件到指定url
HttpUtil.upload("http://microanswer.cn", new File("D:/test.mp3"));
// 如果只有一个文件， 则该文件的表单name是：file

// 多个文件
HttpUtil.upload("http://microanswer.cn", new File("D:/test.mp3"), new File("D:/test1.mp3"), new File("D:/test2.mp3"));
// 如果有多个文件，则第一个文件的表单name是：file，往后依次：file1, file2,file3,...
```

## 网站

[Microanswer](https://www.microanswer.cn)。