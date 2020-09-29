public class maxDays{
   public static final int ispresent=1;
   public static final int ispartime=2;
   public static final int wageperhour=20;
   public static final int num_of_wrk_days=20;
	public static final int max_hrs_inMnth=100;

   public static void main(String args[]){
      int empHrs=0;
      int totalEmpHrs=0;
      int totalWrkDays=0;

   while(totalEmpHrs <= max_hrs_inMnth && totalWrkDays < num_of_wrk_days){
	totalWrkDays++;
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
      totalEmpHrs += empHrs;
      System.out.println("Day#: " +totalWrkDays + "Emp Hour : " +empHrs);
   }
	int totalEmpWage = totalEmpHrs * wageperhour;
   System.out.println("Total empwage :" + totalEmpWage);
}

}
