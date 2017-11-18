package exam51;
import java.io.*;
import java.net.URL;


public class NAVER {
	URL url;
	BufferedReader input;
	String inLine;
	int j;
	
	public NAVER(String site) {
		try {
			this.url = new URL(site);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printPage() {
		try {
			int i=5000;
			int k=0;
			input = new BufferedReader(new InputStreamReader(url.openStream()));

			
			while((inLine = input.readLine()) !=null) {
				k++;
				if(inLine.startsWith("				<th scope=\"row\" class=\"h_th2 th_cop_comp2\"><span>") ) {
					this.j=k;
				}
					
				if(i>j && j!=0) {
					System.out.println(inLine);
					i--;
				}
				
				
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String site = "http://finance.naver.com/item/main.nhn?code=005930#";
		NAVER homePage = new NAVER(site);
		homePage.printPage();
	}
	//<span>현재가  를 찾아서 앞부분제거

}
