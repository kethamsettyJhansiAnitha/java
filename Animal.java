package record;

public class Animal {
	record animal(String name,String food) {
		animal(){
		this ("Cat","milk");}
		public static void main(String args[]) {
		animal a=new animal("Cat","milk");
	animal b=new animal("Ant","Sugar");
	animal c=new animal("Dog","Pedigree");
	animal d=new animal("Cow","Grass");
	animal e=new animal("Rabbit","Carrot");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	
		
		}
	}

}
