public class monthwage{
   public static final int ispresent=1;
   public static final int ispartime=2;
   public static final int wageperhour=20;
	public static final int num_of_wrk_days=2;

   public static void main(String args[]){
      int empHrs=0;
      int empwage=0;
		int totalEmpwage=0;

	for(int day=0;day < num_of_wrk_days;day++){

      int empCheck=(int) Math.floor(Math.random()*3);
	  switch (empCheck){
		   case ispresent:
      	empHrs=8;
      	break;
   		case ispartime:
      	empHrs=4;
      	break;
   		default:
      	empHrs=0;
   	}
      empwage=wageperhour*empHrs;
   	totalEmpwage += empwage;
	   System.out.println("Empwage :" +empwage);
	}
	System.out.println("Total empwage :" + totalEmpwage);
}

}
