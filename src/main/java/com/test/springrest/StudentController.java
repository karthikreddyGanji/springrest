package com.test.springrest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class StudentController {

	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return studentRepository.findAll();
	}
	
	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		
	Student studentDb =	studentRepository.save(student);
		return studentDb;
		
	}
    @DeleteMapping("/del/{sid}")
		public String del(@PathVariable int sid ){
    	 studentRepository.deleteById(sid);
    	 return "deleted Successfully";
    }
    
    
    @GetMapping("/id/{sid}")
    public Optional<Student> getById (@PathVariable int sid) {
    	Optional<Student> sa=studentRepository.findById(sid);
    	return sa;
    }
}
