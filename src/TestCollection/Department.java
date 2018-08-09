package TestCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Properties;

public class Department {
	private String name;
	private String [] empname;
	private List<Employee> emplist;
	private Set<Employee> empset;
	private Map<String,Employee> empMap;
	private Properties pp;
	
	
	public Properties getPp() {
		return pp;
	}
	public void setPp(Properties pp) {
		this.pp = pp;
	}
	public Map<String, Employee> getEmpMap() {
		return empMap;
	}
	public void setEmpMap(Map<String, Employee> empMap) {
		this.empMap = empMap;
	}
	public Set<Employee> getEmpset() {
		return empset;
	}
	public void setEmpset(Set<Employee> empset) {
		this.empset = empset;
	}
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmpname() {
		return empname;
	}
	public void setEmpname(String[] empname) {
		this.empname = empname;
	}
}
