package com._04.javabased.model;

public class Department {

	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department{" +
				"departmentName='" + departmentName + '\'' +
				'}';
	}
}
