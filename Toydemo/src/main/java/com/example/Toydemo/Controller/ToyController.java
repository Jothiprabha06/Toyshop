package com.example.Toydemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Toydemo.Model.ToyDemo;
import com.example.Toydemo.Service.ToyService;

@RestController
public class ToyController {

	@Autowired
	ToyService ts;
	
	@GetMapping("/all")
	public List<ToyDemo> allDetails(){
		return ts.getAllDetails();
	
	}
	@PostMapping("/save")
	public String saveAll(@RequestBody ToyDemo a) {
		ts.saveDetails(a);
		return "Saved";
	}
	@PutMapping("/update")
    public String saveall(@RequestBody ToyDemo i) {
		ts.saveupdate(i);
		return "Updated";
	}
	@DeleteMapping("/delete/{j}")
	public String deleteDetails(@PathVariable int j) {
		ts.deleteDetails(j);
		return "Deleted";
	}
}
