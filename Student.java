package record;
public class Student {
		record student(String name,String course,int rollno) {
		student(){
		this("Jhansi" , "Computer Science",504);}
		public static void main(String args[]) {
		student s=new student("pooji" , "Computer Science" ,501);
		student s1=new student("Pavan" , "Computer Science" ,502);
		student s2=new student("Anitha" , "Computer Science" ,503);
		student s3=new student("Jhansi" , "Computer Science" ,504);
		student s4=new student("Maneesha", "Computer Science" ,505);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
			
		}
		}
