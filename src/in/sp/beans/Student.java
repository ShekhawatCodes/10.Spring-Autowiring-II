package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String name;
	private long rollNo;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Subject subjects;
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("rollNo : "+rollNo);
		System.out.println("address : "+address);
		System.out.println("subjects : "+subjects);
		
	}
	
	
}
