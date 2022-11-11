package string;

public class S3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S1=new String("Spring");
S1.concat("fall");//(Spring Fall its Stores for Garbage collecter.)
String S2= S1.concat("Winter");
S2.concat("Summer");//Spring Winter;
System.out.println(S1);//Spring;
System.out.println(S2);//Spring Winter;
	}
	

}
