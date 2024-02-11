package com.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.project.entity.Valid;

@Service
public class validService {
		
public static List<Valid> list =new ArrayList<>();
	
	static
	{
		list.add(new Valid(101,"Java","ABC",55));
		list.add(new Valid(102,"Java Second","XYZ",56));
		list.add(new Valid(103,"Java Third","MNO",57));
	}
	
	public List<Valid> getValid()
	{
		return list;
	}
	
    public Valid getValid(int id) {
		
		// search the book from list using it's id and return it.
		Valid valid = null;
		
		valid=list.stream().filter(b->b.getId()==id).findFirst().get();
		
		return valid;
	}
    
   public void deleteValid(int id) {
		
		list = list.stream().filter(b->b.getId()!=id).collect(Collectors.toList());
	}
   
   public Valid addNewValid(Valid valid) {
		
		list.add(valid);
		System.out.println("Valid is successfully added ");
		//System.out.println(valid);
		
		return valid;
	}
   
   public Valid updateValid(int id, Valid valid) {
		
		 list.stream().map(b->{
		
			if(b.getId()==id)
			{
//				b.setAuthor(book.getAuthor());
//				b.setBookName(book.getBookName());
				b.setDescription(valid.getDescription());
				b.setName(valid.getName());
				b.setPrice(valid.getPrice());
				
			}
			return b;
			
		}
							
				
		).collect(Collectors.toList());
		
		return valid;
	}
    


}
