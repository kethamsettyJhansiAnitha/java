package record;


		record Person(String name, double weight, double height, String foodhabbit) {
		Person() {
		this("Raju",62.35,75,"Non-Veg"); }
		public static void main(String args[]) {
		Person p=new Person("Raju",62.35,75,"Non-Veg");
   Person p1=new Person("Chitti",45.5,5.5,"Pure veg");
	Person p2=new Person("Naga",35.66,55,"Non-Veg");
	Person p3=new Person("Bhagi",62.35,75,"Veg");
	Person p4=new Person("Ajay",62.35,75,"non-veg");
	Person p5=new Person("Arjun",25.35,75,"Non-Veg");
	System.out.println(p);
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	System.out.println(p4);
	System.out.println(p5);
		
}
	}

