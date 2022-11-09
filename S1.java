package string;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=  ("chinnu");
		String s2=  ("chinnu");
		String s3=  ("Ani");
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s3==s1);//false
		String s4=   ("anu");
		String s5=  ("anu");
		System.out.println(s4==s5);//true
		String s6= new String  ("john");
		String s7= new String ("john");
		System.out.println(s6==s7);//false
		
	}
}