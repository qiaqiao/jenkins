package com.test.govTest;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.assertTrue;

public class loginTest {
    ChromeDriver chromeDriver;
    //登录页网址
    private static String loginUrl="http://172.16.197.147:81/user/login?redirect=%2Fdashboard%2Fanalysis";

    @Test  //这是数据治理的登录的测试用例
    public void testTitle() throws InterruptedException {
        //2.访问数据治理
        chromeDriver.get(loginUrl);
        String title=chromeDriver.getTitle();
        //测试标题是否符合
        assertTrue(title.equals("船用设备运维数据管理平台"));

    }
    @Test  //这是数据治理的登录的测试用例
    public void testLogin() throws InterruptedException {
        //2.输入密码
        chromeDriver.findElement(By.id("loginUserName")).sendKeys("admin");
        chromeDriver.findElement(By.id("loginPassword")).sendKeys("123456");
        Thread.sleep(2000);
        //解决验证码
    }


   //@BeforeTest  //将会在并行的第一个Test方法执行之前运行
    @BeforeMethod   //将会在当前测试类的每一个Test方法执行之前运行
    //@BeforeClass  //将会在当前类第一个测试方法之前执行
    public void beforeTest(){
        //设置驱动文件路径
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        chromeDriver=new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }

    @AfterClass
    public void afterTest() {
        chromeDriver.quit();
    }

//    @Parameters({"url","browser"})  //参数会按顺序接收
//    @BeforeTest  //将会在并行的第一个Test方法执行之前运行
//    public void beforeTestNg(String url,String br) throws InterruptedException {
//        if(br.equals("Chrome")) {
//            //设置驱动文件路径
//            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//            chromeDriver = new ChromeDriver();
//            chromeDriver.manage().window().maximize();
//            chromeDriver.get(url);
//            Thread.sleep(2000);
//        }
//    }

}
