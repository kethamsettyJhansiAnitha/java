package record;

public class Student {
	record student(String name,String course,int rollno) {
		student(){
			this("Jhansi" , "Computer Science",504);}
		public static void main(String args[]) {
			student s=new student("Jhansi" , "Computer Science" ,504);
			System.out.println(s);
			
		}
		}


}
