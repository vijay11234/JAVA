public class saveTotalwage{
   public static final int ispresent=1;
   public static final int ispartime=2;

	private final String company;
	private final int wageperhour;
	private final int num_of_wrk_days;
   	private final int max_hrs_inMnth;
	private  int totalEmpWage;

 public saveTotalwage(String company, int wageperhour,int num_of_wrk_days,
	int max_hrs_inMnth)
{
		this.company=company;
		this.wageperhour=wageperhour;
		this.num_of_wrk_days=num_of_wrk_days;
		this.max_hrs_inMnth=max_hrs_inMnth;
}
public void computeEmpWage()
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
   totalEmpWage = totalEmpHrs * wageperhour;
}
@Override
public String toString()
{
	return "Total Emp wage for Company : " +company+ " is " +totalEmpWage;
}
public static void main(String args[])
{
   saveTotalwage dmart= new saveTotalwage("Dmart",20,20,100);
   saveTotalwage reliance=new saveTotalwage("Reliance",10,40,200);
	dmart.computeEmpWage();
	System.out.println(dmart);
	reliance.computeEmpWage();
	System.out.println(reliance);
}

}
