public class Empcase{
	public static final int ispresent=1;
	public static final int ispartime=2;
	public static final int wageperhour=20;

   public static void main(String args[]){
      int empHrs=0;
      int empwage=0;

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
      System.out.println("Empwage :" +empwage);
   }
}
