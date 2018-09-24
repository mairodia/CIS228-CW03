// Programmer: Jennifer King
// Date: 09/24/2018
// File: CompSciStudent.java

public class CompSciStudent extends Student 
{
	private final int MATH_HOURS = 20,
					  CS_HOURS = 40,
					  GEN_ED_HOURS = 60;
	
	private int mathHours, csHours, genEdHours;
	
	public CompSciStudent(String n, String id, int year)
	{
		super(n, id, year);
	}
	public void setMathHours(int math)
	{
		mathHours = math;
	}
	public void setCsHours(int cs)
	{
		csHours = cs;
	}
	public void setGenEdHours(int genEd)
	{
		genEdHours = genEd;
	}
	
	@Override
	public String toString()
	{
		String str;
		
		str = super.toString() +
			  "\nMajor: Computer Science" +
			  "\nMath Hours Taken: " + mathHours +
			  "\nComputer Science Hours Taken: " + csHours +
			  "\nGeneral Ed Hours Taken: " + genEdHours;
		
		return str;
	}

	@Override
	public int getRemainingHours()
	{
		int reqHours, remainingHours;
		
		reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
		
		remainingHours = reqHours - (mathHours + csHours + genEdHours);
		
		return remainingHours;
	}
}
