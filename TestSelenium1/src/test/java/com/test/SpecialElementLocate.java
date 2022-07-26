package com.test;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SpecialElementLocate {
    private static ChromeDriver chromeDriver;
    public static void  main(String []args) throws InterruptedException {
        openChrome();
//        //访问本地html文件
//        chromeDriver.get("D:\\1Adata\\TestSelenium1\\src\\main\\resources\\alert.html");
//        chromeDriver.findElement(By.id("btn1")).click();
//        Thread.sleep(2000);
//        //switchTo().alert() :找到对应alert弹框
//        Alert alert=chromeDriver.switchTo().alert();
//        //alert弹框的确认
////        alert.accept();
//        //取消
//        alert.dismiss();
//        //获取文本
//        System.out.println("获取alert文本:"+alert.getText());

//        //访问本地html文件
//        chromeDriver.get("D:\\1Adata\\TestSelenium1\\src\\main\\resources\\confirm.html");
//        chromeDriver.findElement(By.id("btn1")).click();
//        Thread.sleep(2000);
//        //找到对应confirm弹出框
//        Alert alert= chromeDriver.switchTo().alert();
//        //确定
//        alert.accept();
//        //让弹窗消失，并非点击取消
//        alert.dismiss();
//        //获取文本
//        System.out.println("获取alert文本:"+alert.getText());

//        /**
//         * a内嵌b,b内嵌c
//         */
//        //访问本地html文件
//        chromeDriver.get("D:\\1Adata\\TestSelenium1\\src\\main\\resources\\a.html");
//        //在默认页面输入数据
//        chromeDriver.findElement(By.id("aa")).sendKeys("111");
//        Thread.sleep(2000);
//        //进入第一个内嵌页面，输入数据
//        //切换iframe
//        chromeDriver.switchTo().frame("bfame");
//        //输入数据
//        chromeDriver.findElement(By.id("bb")).sendKeys("222");
//        Thread.sleep(2000);
//        //进入第二个内嵌页面，输入数据
//        //切换iframe
//        chromeDriver.switchTo().frame("cfame");
//        //输入数据
//        chromeDriver.findElement(By.id("cc")).sendKeys("333");
//
//        //回到默认页面
//        chromeDriver.switchTo().defaultContent();

//        /**
//         * a页面 ，点击跳转到b c
//         */
//        //访问本地html文件
//        chromeDriver.get("D:\\1Adata\\TestSelenium1\\src\\main\\resources\\a.html");
//        chromeDriver.findElement(By.id("aa")).sendKeys("这是第一个窗口");
//        System.out.println("跳转前的窗口句柄 "+chromeDriver.getWindowHandle());
//        Thread.sleep(2000);
//        //切换到b窗口
//        chromeDriver.findElement(By.id("bb")).click();
//        //虽然页面已经到了b窗口，但是句柄还是在a窗口中，所以操作的还是a窗口
//        Thread.sleep(2000);
//        System.out.println("跳转后的窗口句柄 "+chromeDriver.getWindowHandle());
//        //句柄的切换
//        //进入到b窗口后，获得所有的句柄
//       Set<String> handles=chromeDriver.getWindowHandles();
//       //对句柄集合遍历
//        for (String handle:handles){
//            //切换句柄
//            chromeDriver.switchTo().window(handle);
//            //如何获得b的句柄？
//            if(chromeDriver.getTitle().equals("b.html")){
//              break;  //若title符合，调出循环
//            }
//        }
//        //对b窗口元素定位
//        chromeDriver.findElement(By.id("bb")).sendKeys("这是第二个窗口");

//        /**
//         * select下拉框
//         */
//        chromeDriver.get("https://www.baidu.com/");
//        //设置-高级搜索
//        chromeDriver.findElement(By.id("s-usersetting-top")).click();
//        chromeDriver.findElement(By.xpath("//span[text()='高级搜索']")).click();
//        Thread.sleep(2000);
//        ///定位选择时间下拉框
//        WebElement webElement=chromeDriver.findElement(By.name("gpc"));
//        //封装成Select对象
//        Select select=new Select(webElement);
//        //索引值从0开始
//        select.selectByIndex(1);
//        Thread.sleep(2000);
//        select.selectByVisibleText("最近一月");

//        /**
//         * 时间控件
//         */
//        //可以input输入
//        chromeDriver.findElement(By.id("xxx")).sendKeys("2022-03-22");
//        //限制输入 移除掉他的readOnly属性
//        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) chromeDriver;
//        javascriptExecutor.executeScript("document.getElementById('xxx').removeAttribute('readOnly')");
//        Thread.sleep(1000);
//        chromeDriver.findElement(By.id("xxx")).sendKeys("2022-03-22");

//        //鼠标操作
//        WebElement sourceElement= chromeDriver.findElement(By.id("xxx"));
//        WebElement targetElement= chromeDriver.findElement(By.id("xxx1"));
//        Actions actions=new Actions(chromeDriver);
//        actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

        /**
         * 文件上传
         */
        //选择文件
        chromeDriver.findElement(By.xpath("//input[@value='选择文件']")).sendKeys("文件路径");
        Thread.sleep(1000);
        //点击上传
        chromeDriver.findElement(By.name("上传")).click();

        //若文件上传不是input类型，那就需要用到第三方工具，比如autoi

    }
    public static void openChrome(){
        //设置驱动文件路径
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //1.打开Chrome浏览器
        chromeDriver=new ChromeDriver();
    }
}
