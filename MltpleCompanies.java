public class MltpleCompanies{
   public static final int ispresent=1;
   public static final int ispartime=2;

   public static int computeEmpwage(String company, int wageperhour,int num_of_wrk_days,int max_hrs_inMnth)
{

      int empHrs=0;
      int totalEmpHrs=0;
      int totalWrkDays=0;

     while(totalEmpHrs <= max_hrs_inMnth && totalWrkDays < num_of_wrk_days)
   {
        totalWrkDays++;
        int empCheck=(int) Math.floor(Math.random()*3);
     switch (empCheck)
      {
         case ispresent:
         empHrs=8;
         break;
         case ispartime:
         empHrs=4;
         break;
         default:
         empHrs=0;
      }
      totalEmpHrs += empHrs;
      System.out.println("Day#: " +totalWrkDays + "Emp Hour : " +empHrs);
   }
   int totalEmpWage = totalEmpHrs * wageperhour;
   System.out.println("Total empwage :" + totalEmpWage);
   return totalEmpWage;
}
public static void main(String args[])
{
   computeEmpwage("Dmart",20,20,100);
	computeEmpwage("Reliance",10,40,200);
}

}
