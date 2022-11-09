package string;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer Sb= new StringBuffer ("Jhansi");
Sb.append("Anitha");
System.out.println(Sb);//output:Jhansi Anitha
		
//		
////	String buffer is class in java it is a sequence of character it represent the double codes.
////		String buffer is mutable means all changes are applicable in string buffer.(.equals() method is overridden for content
////		comparsion.
String S1= new String("chinnu");
String S2= new String("chinnu");
String S3= new String("Anitha");
System.out.println(S1.equals (S2));//true
System.out.println(S3.equals (S2));//false
//
//		;//false(.equals() method is overridden for content
////		comparsion.
		
        String S4 =new String ("Dog");
		String S5 =new String ("Dog");
		System.out.println(S4==S5);//false
		System.out.println(S4.equals (S5));//true
		StringBuffer Sb1 =new StringBuffer ("Dog");
		StringBuffer Sb2 =new StringBuffer ("Dog");
		System.out.println(Sb1==Sb2);//false
		System.out.println(Sb1.equals (Sb2));//false
		 
	}
}