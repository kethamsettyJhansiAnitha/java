package string;

public class S3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String S1=new String("Spring");
//S1.concat("fall");//(Spring Fall its Stores for Garbage collecter.)
//String S2= S1.concat("Winter");
//S2.concat("Summer");//Spring Winter;
//System.out.println(S1);//Spring;
//System.out.println(S2);//Spring Winter;
			String S1=new String("you cannot change me");
			String S2=new String("you cannot change me");
			System.out.println(S1==S2);//false
			String S3= "you cannot change me ";
			System.out.println(S2==S3);//false
			String S4= "you cannot change me ";
			System.out.println(S3==S4);//true
			String S5= "you cannot"+" change me ";
			System.out.println(S4==S5);//true
			String S6= "you cannot ";
			String S7=S6+ "Change me ";
			System.out.println(S4==S7);//false
			final String s8 ="you cannot";
			String S9=s8+"change me";
			System.out.println(S4==S9);
	}
}
