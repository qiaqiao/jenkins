package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOperate {
    private static  ChromeDriver chromeDriver;
    public static void  main(String []args) throws InterruptedException {
        openChrome();
//        chromeDriver.findElement(By.id("kw")).sendKeys("腾讯课堂");
//        //等待3s
//        Thread.sleep(3000);
//        //清空搜索框文本值
//        chromeDriver.findElement(By.id("kw")).clear();

        WebElement webElement= chromeDriver.findElement(By.id("kw"));
        System.out.println("得到元素标签名: "+webElement.getTagName());

        System.out.println("得到元素maxlength: "+webElement.getAttribute("maxlength"));

        WebElement webElement2 = chromeDriver.findElement(By.xpath("//a[text()='hao123']"));
        System.out.println("得到元素文本值: "+webElement2.getText());
        System.out.println("元素是否显示: "+webElement2.isDisplayed());
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
