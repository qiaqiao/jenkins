package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocate {
    //静态全局变量
    private static  ChromeDriver chromeDriver;
    public static void  main(String []args){
      openChrome();
//      //定位百度的搜索框元素，并输入数据：腾讯课堂
//     chromeDriver.findElement(By.id("kw")).sendKeys("腾讯课堂");
//
//     //定位百度的搜索框元素，并输入数据（name定位）腾讯课堂-name属性可能会重复
//     chromeDriver.findElement(By.name("wd")).sendKeys("腾讯课堂");
//
//     //定位百度的搜索框元素，并输入数据（tagName定位）腾讯课堂--但是会找到多个元素（不推荐
//     chromeDriver.findElement(By.tagName("input")).sendKeys("腾讯课堂");

//       //定位百度的搜索框元素，并输入数据（className定位）腾讯课堂--但是会找到多个元素（不推荐
//       chromeDriver.findElement(By.className("s_ipt")).sendKeys("腾讯课堂");
//       //报错：因为通过className来定位元素，他只能用一个
//       chromeDriver.findElement(By.className("bg s_btn")).click();

//        //定位"新闻"元素,并且点击（linkText）--超链接的完整文本
//        chromeDriver.findElement(By.linkText("新闻")).click();
//        //定位"新闻"元素,并且点击（partialLinkText）--超链接的部分文本
//        chromeDriver.findElement(By.partialLinkText("闻")).click();

//        //cssSelector元素定位-tagName
//        //不推荐，标签名容易重复
//        chromeDriver.findElement(By.cssSelector("input")).sendKeys("腾讯课堂");
//        //cssSelector元素定位-id (#表示id的标识符)
//        chromeDriver.findElement(By.cssSelector("#kw")).sendKeys("腾讯课堂");
//        //cssSelector元素定位-calssName
//        chromeDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("腾讯课堂");
//        //符合样式 中间空格用.代替
//        chromeDriver.findElement(By.cssSelector(".bg.s_btn")).click();
//        //精确定位
//        chromeDriver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("腾讯课堂");
        //多属性精确定位
        chromeDriver.findElement(By.cssSelector("input[maxlength='255'][autocomplete='off']")).sendKeys("腾讯课堂");
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
