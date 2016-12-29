package month;

import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class dog {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// hi
			test ts =new test();
			ts.setName("hi");
			ts.setSex("女");
			
			System.out.println(ts.getSex().charAt(0));
			char[] test={97,98};
			String test11=new String(test, 0, test.length);
			System.out.println(test11.charAt(0));
			String test22="123456";System.out.println();
			StringBuffer tes=new StringBuffer();
			tes.append("123456789");
			System.out.println(tes.toString());
			System.out.println(tes.reverse());
			System.out.println();
			
//			StringTokenizer st=new StringTokenizer("1235123");
//			while (st.hasMoreElements()) {
//				System.out.println(st.nextToken("5"));
//				
//			}
//			 
//
//			 long begins = System.currentTimeMillis(); 	
//			 System.out.println((begins-begin));
//			System.out.println((float)(begins-begin)/1000f+"秒");
			
			
			
//			String s="abc";
//			 final  int ttime = 10000;// 測試循環次數  
//			
//			 long begin = System.currentTimeMillis();  
//		        for (int i = 0; i < ttime; i++) {  
//		            s += "add";  
//		        }  
//		        long over = System.currentTimeMillis();  
//		        System.out.println(" 操作 " + s.getClass().getName() + " 類型使用的時間為： "  
//		                + (over - begin) + " 毫秒 ");  
//			

	}
}
class test{
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
