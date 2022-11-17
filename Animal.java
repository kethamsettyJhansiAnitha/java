package record;

public class Animal {
	record animal(String name,String food) {
		animal(){
		this ("Cat","milk");}
		public static void main(String args[]) {
		animal a=new animal("Cat","milk");
		System.out.println(a);
		}
	}

}
