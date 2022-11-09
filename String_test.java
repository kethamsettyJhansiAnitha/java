package string;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S =new String("Manvith");
S.concat("Software");
System.out.println(S);
	}
//	String is not but sequence of character it represents a double codes.
//	String is immutable means changes are not applicable in strings.
//	equals() method  present in only object class also meant for reference Comparision
//	are address comparsion.
//	equals method
		String s1=  ("chinnu");
		String s2=  ("chinnu");
		String s3=  ("Ani");
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s3==s1);//false

}
