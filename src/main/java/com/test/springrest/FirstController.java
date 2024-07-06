package com.test.springrest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	private static final Student Student = null;
	@GetMapping("/welcome")
	public String Name() {
		//test
		return "Karthik";
		
	}
	
	@GetMapping("/welcomes/{name}/{age}")
	public String getWelcomeMessage(@PathVariable String name,@PathVariable int age ) {
		
		return "Welcome "+name +age;
		
	}
	@GetMapping("/getStudentdetails")
	public Student getStudentDetails() {
		
		Student ob= new Student();
		ob.setSid(10);
		ob.setSname("Ram");
		ob.setsBranch("cse");
		
		return ob;

}
	@GetMapping("/getStudentlist")
	public List<Student> getStudentlist() {
		
		List<Student> students=new ArrayList<Student>();
		
		Student ob= new Student();
		ob.setSid(10);
		ob.setSname("Ram");
		ob.setsBranch("cse");
		
		students.add(ob);
		
		Student ob1= new Student();
		ob1.setSid(11);
		ob1.setSname("rock");
		ob1.setsBranch("ece");
		students.add(ob1);
		
		Student ob2= new Student();
		ob2.setSid(12);
		ob2.setSname("karthik");
		ob2.setsBranch("eee");
		students.add(ob2);
		
		
		return students;

}    @GetMapping("/ramu")
	public String Names() {
		return "Ramu";
	}
    @GetMapping("/addition/{a}/{b}")
    public String ramu(@PathVariable int a,@PathVariable int b) {
          int d;
          int c;
          int e;
          int f;
          c=a+b;
          d=a*b;
          e=b-a;
          f=b/a;
    	return "The sum is "+c+ " \nThe product is "+d+"\nThe subtraction is "+e+"\nThe division is "+f; 
    	
    }
    
    @GetMapping("/age/{a}")
    public String age(@PathVariable int a) {
    	
       
    	
    	if(a==18) {_
    		return "eligle to vote" +a;
    	}else if(a>18) {
    		return "eligle to vote" +a;
    	}else {
    		return "not eligible to vote" +a;
    	}
    	
    	
    }
    @GetMapping("/rev/{b}")
    public String rev(@PathVariable int b) {
    	int rev=0,rem=0;
    	int c;
    	c=b;
    	while(b>0) {
    		rem=b%10;
    		rev=rev*10+rem;
    		b=b/10;
    	}
    	if(rev==c) {
    		return "The number " +c +" is palindrome";
    	}else {
    		return "The number " +c +" is not palindrome";
    	}
    	
    	
    }
    @GetMapping("/prime/{a}")
    public String prime(@PathVariable int a) {
    	int i,count=0;
    	for(i=1;i<=a;i++) {
    		if(a%i==0) {
    			count++;
    		}
    		
    		}
    		 if(count>2) {
    			return "The number "+a+" is not a prime number";
    		}else {
    			return "The number "+a+ " is a prime number";
    		}	
    }  
}