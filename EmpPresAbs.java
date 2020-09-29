public class EmpPresAbs{
	public static void main(String args[]){
		int ispresent=1;
		double empCheck=Math.floor(Math.random()*2);
		System.out.println(empCheck);
	if(ispresent==empCheck){
		System.out.println("Employee is present");
	}
	else
		System.out.println("Employee is Absent");
	}
}
