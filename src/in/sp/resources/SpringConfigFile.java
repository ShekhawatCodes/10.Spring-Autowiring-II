package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subject;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddressObj() {
		Address addr = new Address();
		addr.setHouseno(107);
		addr.setCity("Kishangarh");
		addr.setPincode(201301);
		
		return addr;
	}
	
	@Bean
	public Subject createSubjectObj() {
		Subject subj = new Subject();
		List<String> subject_list = new ArrayList<String>();
		subject_list.add("Java");
		subject_list.add("Python");
		subject_list.add("C++");
		
		subj.setSubjects(subject_list);
		return subj;
	}
	
	@Bean
	public Student createStudentObj() {
		Student std = new Student();
		std.setName("Vinayak Vyas");
		std.setRollNo(177);
	//	std.setAddress(createAddressObj());	    		//manual DI
	//  std.setSubjects(createSubjectObj());  			//manual DI
		
		return std;
	}
}
