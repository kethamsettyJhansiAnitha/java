package records;



public class mnc_company {
	record MNC_Company(int Companystaff,String Companyname,int Salary,String location) {
		MNC_Company(){
			this(100000,"IBM" , 30000,"Banglore");}
		public static void main(String args[]) {
			MNC_Company m=new MNC_Company(100000,"IBM" ,	 30000 , "Banglore ");
			MNC_Company m1=new MNC_Company(20000,"TCS", 	40000 ,  "Delhi");
			MNC_Company m2=new MNC_Company(300000,"INFOSYS",50000,   "NOIDA");
			MNC_Company m3=new MNC_Company(400000,"CAPGEMINI",60000, "CHENNAI");
			MNC_Company m4=new MNC_Company(500000,"MIND TREE",70000, "MYSORE");
			System.out.println(m);
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			System.out.println(m4);
		}
	}
}
