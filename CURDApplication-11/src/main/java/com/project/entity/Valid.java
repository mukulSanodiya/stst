package com.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Valid {

	@Id
	private int id;
	//@NotNull(message ="Name cannot be null")
	//@NotBlank(message ="Name cannot be blank")
	private String name;
	
	//@NotBlank(message ="description cannot be blank")
	private String description;
	
	//@Min(value=0, message="Please Enter the value")
	private double price;
}
