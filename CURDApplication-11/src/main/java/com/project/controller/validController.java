package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Valid;
import com.project.service.validService;

@RestController
public class validController {

	
	@Autowired
	private validService service;

	@GetMapping("/valid")
	public List<Valid> getValid()
	{	
		List list= service.getValid();
		
		return list;
	}
	@GetMapping("/valid/{id}")
	public Valid getId(@PathVariable("id") int id)
	{
		Valid v=service.getValid(id);
		
		return v;
	}
	
	@DeleteMapping("/valid/{id}")
	public void deleteValid(@PathVariable("id") int id)
	{
		 service.deleteValid(id);
		 //return "book is deleted successfully whose bookId is "+id;
	}
	
	@PostMapping("/valid")
	public Valid addValid(@RequestBody Valid v)
	{
		Valid va=service.addNewValid(v);
		
		return va;
	}
	
	@PutMapping("/valid/{id}")
	public Valid updateBookHandler(@PathVariable("id")int id,@RequestBody Valid v)
	{
		Valid va=service.updateValid(id, v);
		return va;
	}
	
	
	

}
