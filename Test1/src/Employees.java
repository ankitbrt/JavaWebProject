import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employees {
	@XmlElement(name="employee")
	private ArrayList<Employee> emp=new ArrayList<Employee>();
	
	
	public ArrayList<Employee> getEmployees() {
		return emp;
	}

	public void setEmployees(ArrayList<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+emp;
	}
}
