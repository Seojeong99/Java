package Selenium2;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class letscheckjsoup {
	private final static String address = "https://coronaboard.kr/";
	public static void main(String[] args) throws Exception {
	    //String articleURL = "http://www.imaeil.com/sub_news/sub_news_view.php?news_id=20000&yy=2015";   //�Ź���� URL
        Document doc = Jsoup.connect(address).header("User-Agent", "Mozilla/5.0").get();
        
        String h1 = doc.select("h1").text();
        String h2 = doc.select("h2").eq(1).text();
        String h3 = doc.select("div.row dashboard domestic").text();
        //String h3 = doc.select(".col-3 col-sm-3 col-md-2 text-center").text();
        //Elements contents = doc.select("p");
        
        
        System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		/**
		//idx = ���� ������� ������ ���° ������ ��Ÿ��
		int idx = 0;
		//foreach���� �̿��Ͽ� ���
		for(Element element : contents){
			if(0<idx && idx<5){
				//<p>�±��� ���븸�� �����ϱ� ���� .text()�޼��� ���
				System.out.println(element.text());
			}
			idx++;
       // System.out.println(doc);// document ��ü ����.
			}**/
	}
}

