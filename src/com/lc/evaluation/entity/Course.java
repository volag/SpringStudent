package com.lc.evaluation.entity;

import com.lc.evaluation.entity.basic.EntityMine;

public class Course implements EntityMine{

	private Integer id;
	private String no;
	private String name;
	private String type;
	private String teacherName;
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", no=" + no + ", name=" + name + ", type=" + type + ", teacherName=" + teacherName
				+ "]";
	}
	

}
