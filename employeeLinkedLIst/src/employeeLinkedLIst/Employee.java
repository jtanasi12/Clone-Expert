package employeeLinkedLIst;

public class Employee 
{
	private String firstName;
	private String lastName;

	private int    idNumber;
	
	
	
	public Employee(String firstName, String lastName, int idNumber)
	{
		this.firstName = firstName;
		this.lastName  = lastName;
		
		this.idNumber  = idNumber;
		
	}
	
	public String toString()
	{
		
		String result = firstName + "\t" + lastName + "\t" + idNumber;
		
		
		return result;
	}
}
