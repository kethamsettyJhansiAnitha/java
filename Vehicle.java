package records;

;

public class Vehicle {
	record vehicle(String name,int tyres) {
		vehicle(){
		this ("Maruthi",4);}
		public static void main(String args[]) {
		vehicle a=new vehicle("Maruthi",4);
		vehicle b=new vehicle("Audi",4);
		vehicle c=new vehicle("RR",4);
		vehicle d=new vehicle("Sports Car",4);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
			}
		}

	}


