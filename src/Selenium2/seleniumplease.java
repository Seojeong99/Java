package Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumplease {
	public static void main(String[] args) {
		 
        seleniumplease selTest = new seleniumplease();
        selTest.crawl();

}
	//WebDriver
    private WebDriver driver;
    
    //Properties
    
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "D:/selenium/chromedriver_win32/chromedriver.exe";
    
    //ũ�Ѹ� �� URL
    private String base_url;
    
    public seleniumplease() {
        super();
 
        //System Property SetUp
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        
        //Driver SetUp
        driver = new ChromeDriver();
        base_url = "https://coronaboard.kr/";
    }
    public void crawl() {
    	 
        try {
            //get page (= ���������� url�� �ּ�â�� ���� �� request �� �Ͱ� ����)
            driver.get(base_url);
            System.out.println(driver.getPageSource());
    
        } catch (Exception e) {
            
            e.printStackTrace();
        
        } finally {
 
            driver.close();
        }
 
    }
 
}
