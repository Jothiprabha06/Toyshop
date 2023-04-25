package com.example.Toydemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Toydemo.Model.ToyDemo;
import com.example.Toydemo.Repository.ToyRepository;

@Service
public class ToyService {
	
	
	@Autowired
	ToyRepository ts;
	
	public List<ToyDemo> getAllDetails(){
		
		return ts.findAll();
	}
	public ToyDemo saveDetails(@RequestBody ToyDemo b) {
		
		return ts.save(b);
	}
	public ToyDemo saveupdate(@RequestBody ToyDemo c) {
		
		return ts.save(c);
	}
	public void deleteDetails(@PathVariable int d) {
		
		ts.deleteById(d);
	}

	

}
