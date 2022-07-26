package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebTest {
    public static void  main(String []args){
        //设置驱动文件路径
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //1.打开Chrome浏览器
        ChromeDriver chromeDriver=new ChromeDriver();
        //2.访问百度
        chromeDriver.get("https://www.baidu.com/");
    }
}
