# HttpUtil 网络请求工具类

网络请求工具，一个方法完成网络请求。本工具是依赖于 okhttp 进行的再一次封装，使每次网络请求代码更精简。欢迎大家提交issues或反馈bug及建议到
[Microanswer邮箱](mailto::microanswer@outlook.com)

<span style="color:red"> #注意：本工具类里所有方法均为同步方法。 </span>

## 简介

支持：\
1. GET请求\
2. 下载文件\
3. POST表单格式数据\
4. POST JSON数据\
5. 上传文件\
6. 以上所有都支持传递自定义header，参数。\
7. 自动日志记录。（日志规则自动使用你的项目的配置规则）\

## 安装

### maven 项目
```xml
<dependency>
    <groupId>cn.microanswer</groupId>
    <artifactId>HttpUtil</artifactId>
    <version>1.1.0</version>
</dependency>
```

### gradle 项目
```groovy
compile group: 'cn.microanswer', name: 'HttpUtil', version: '1.1.0'
```

### 下载 jar 包

[点击下载](http://central.maven.org/maven2/cn/microanswer/HttpUtil/1.1.0/HttpUtil-1.1.0.jar)

## 开始使用

```java
// 使用 Get 请求
String responseString = HttpUtil.get("http://microanswer.cn");
```
```java
// 下载文件到 指定目录
File downloadedFile = HttpUtil.download("http://microanswer.cn", new File("D:/"));
```
```java
// 提交 POST 表单请求
HttpUtil.postFormUrlEncode("http://microanswer.cn/", null);
```
```java
// 提交 POST JSON请求
HttpUtil.postApplicationJson("http://microanswer.cn/api/common.php", (JSONObject) null);
```
```java
// 上传文件到指定url
HttpUtil.upload("http://microanswer.cn", new File("D:/test.mp3"));
// 如果只有一个文件， 则该文件的表单name是：file

// 多个文件
HttpUtil.upload("http://microanswer.cn", new File("D:/test.mp3"), new File("D:/test1.mp3"), new File("D:/test2.mp3"));
// 如果有多个文件，则第一个文件的表单name是：file，往后依次：file1, file2,file3,...
```

```java
// 更复杂的请求可通过：
HttpUtil.post(url, contentType, bodyBytes, headers); 
```

```java
// 关闭日志记录
HttpUtil.LOG = false;
``` 

## 网站

[Microanswer](https://www.microanswer.cn)。