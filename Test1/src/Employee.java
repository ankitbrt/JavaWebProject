import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
public class Employee {
	int empNo, extNo;
	String name, department;
	public int getEmpNo() {
		return empNo;
	}
	public int getExtno() {
		return extNo;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	@XmlElement(name="empno")
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	@XmlElement(name="extno")
	public void setExtno(int extno) {
		this.extNo = extno;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empNo+" "+name+" "+extNo+" "+department;
	}
	
}
