package com.lc.evaluation.entity.category;

public enum UserCategory {
	
	student, teacher, admin
	;
	

	UserCategory(){
		
	}
	
	public static UserCategory getByName(String name){
		return UserCategory.valueOf(name);
	}

	
}
