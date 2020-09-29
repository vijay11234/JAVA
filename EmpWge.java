public class EmpWge{
   public static void main(String args[]){
      int ispresent=1;
		int wageperhour=20;

		int empHrs=0;
		int empwage=0;

		double empCheck=Math.floor(Math.random()*2);


   if(empCheck==ispresent){
		empHrs=8;
	}
	else
		empHrs=0;
		empwage=wageperhour*empHrs;
      System.out.println("Empwage :" +empwage);
	}
}
