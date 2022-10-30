package employeeLinkedLIst;

public class employeeList 
{
	private employeeNode header; // This will point to the first Node in the list 
	
	
	
	public employeeList()
	{
		header = null;
	}
	
	public void addEmployee(Employee newEmployee)
	{
		employeeNode newNode = new employeeNode(newEmployee); // The new node we are placing in the list
		employeeNode current; // Keeps track of the current node 
		
		
		// If the list is empty 
		if(header == null)
			header = newNode; // Header will point to the first node in the chain
		
		else
		{
			current = header; // Point to the beginning of the list 
			
			// While the next Node is not empty, keep traversing 
			while (current.nextEmployee != null)
			{
				current = current.nextEmployee; 
			}
			
			// Once we come to the end
			
			current.nextEmployee = newNode;
		}
	}

	
	public String toString()
	{
		String result = "";
		
		employeeNode current = header; // Go to the beginning of the list
		
		while(current != null)
		{
			result += current.newEmployee + "\n";
			current = current.nextEmployee;
		}
		
		return result;
	}
}
