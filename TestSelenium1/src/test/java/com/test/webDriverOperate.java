package com.test;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverOperate {
    //静态全局变量
    private static ChromeDriver chromeDriver;
    public static void  main(String []args) throws InterruptedException {
        openChrome();
//        System.out.println("输出当前页面url: "+chromeDriver.getCurrentUrl());
//        System.out.println("输出当前页面标题: "+chromeDriver.getTitle());
////        System.out.println("输出当前页面源代码: "+chromeDriver.getPageSource());
//        Thread.sleep(3000);
//        chromeDriver.quit();

//        chromeDriver.findElement(By.id("kw")).sendKeys("腾讯课堂");
//        chromeDriver.findElement(By.id("su")).click();
//        System.out.println("当前页面句柄"+chromeDriver.getWindowHandle());
//        System.out.println("所有句柄"+chromeDriver.getWindowHandles());
//        //等元素全部加载出来
//        Thread.sleep(1000);
//        chromeDriver.findElement(By.xpath("//a[contains(text(),'官方')]")).click();
//        Thread.sleep(3000);
//        System.out.println("当前页面句柄"+chromeDriver.getWindowHandle());
//        System.out.println("所有句柄"+chromeDriver.getWindowHandles());

        WebDriver.Options options=chromeDriver.manage();
        //全屏
        //options.window().fullscreen();
//        //浏览器最大化
//        options.window().maximize();
//        //获取当前窗口大小
//        Dimension size = options.window().getSize();
//        System.out.println("获取高度"+size.getHeight());
//        System.out.println("获取宽度"+size.getWidth());

//        //获取当前窗口位置
//        Point position = options.window().getPosition();
//        System.out.println("获取x"+position.x);
//        System.out.println("获取y"+position.y);

        //navicate对象
        WebDriver.Navigation navigation=chromeDriver.navigate();
        //访问京东
        navigation.to("https://www.jd.com");
        Thread.sleep(1000);
        //刷新
        navigation.refresh();
        Thread.sleep(1000);
        //回退
        navigation.back();
        Thread.sleep(1000);
        //前进
        navigation.forward();

//        //默认关掉第一个窗口
//        chromeDriver.close();
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
