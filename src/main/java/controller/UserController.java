package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.VptEmployee;
import in.vpt.module.UserService;

@RestController
@RequestMapping("/vpt/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@PostMapping("/saveData")
	public ResponseEntity<String> saveData(@RequestBody VptEmployee vptEmployee) {
		userService.saveUserData(vptEmployee);
		return new ResponseEntity<String>("save successfull",HttpStatus.OK);
		
	}
	
	@GetMapping("/get")
		public List<VptEmployee> getData(){
		List<VptEmployee> user=userService.getUserData();
		return user;
			
		}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateData(@PathVariable("id")long id,VptEmployee vptEmployee) {
		userService.updateUserData(id,vptEmployee);
		return new ResponseEntity<String>("update successfull",HttpStatus.OK);
	}
	
	@RequestMapping("/delete/{id}")
	public ResponseEntity<String> deleteData(@PathVariable("id") Long id,VptEmployee VptEmployee) {
		userService.deleteUserData(id);
		return new ResponseEntity<String>("delete successfull",HttpStatus.OK);
	}
	

}
