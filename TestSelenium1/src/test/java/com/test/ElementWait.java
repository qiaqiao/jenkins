package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ElementWait  {
    private static ChromeDriver chromeDriver;
    public static void  main(String []args) throws InterruptedException {
       openChrome();
       //在driver实例化之后设置隐式等待,设置超时时间为5s
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       chromeDriver.findElement(By.id("kw")).sendKeys("腾讯课堂");
       //搜索
       chromeDriver.findElement(By.id("su")).click();
       //等待1s-搜索结果出来（代码执行过快，元素没有立即显示出来
     //  Thread.sleep(1000)
        //显示等待 超时时间：5s
        WebDriverWait webDriverWait=new WebDriverWait(chromeDriver,5);
        //页面元素存在且可见
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='-综合性在线终身学习平台']")));
       chromeDriver.findElement(By.xpath("//a[text()='-综合性在线终身学习平台']")).click();
    }
    public static void openChrome(){
        //设置驱动文件路径
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //1.打开Chrome浏览器
        chromeDriver=new ChromeDriver();
        //2.访问百度
        chromeDriver.get("https://www.baidu.com/");
    }
}
