package practice;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
a=80;
b=90;
System.out.println("Before Swapping: a,b="+a+","+b+""); 
a=a+b;
b=a-b;
a=a-b;
System.out.println( "After Swapping :a,b = "+a+","+b+"");

}
}