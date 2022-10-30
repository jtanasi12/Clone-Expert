package employeeLinkedLIst;

public class employeeNode 
{
	public Employee newEmployee;
	public employeeNode nextEmployee;
	
	
	
	public employeeNode(Employee newEmployee)
	{
		this.newEmployee = newEmployee;
		
		nextEmployee = null;
	}

}
