package vn.edu.vnuk.sep.model;

import vn.edu.vnuk.sep.controller.Observer;
import java.util.Scanner;
import vn.edu.vnuk.sep.define.Define;

public class Staff extends Person implements Observer {
	private String hometown;
	private String department;
	private float salaryRatio;
	private int allowance;
	private String position;
	private int workDay;
	private int yearOfWork;
	private float minimumWage;
	private boolean isCreated;
	
	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(float salaryRatio) {
		this.salaryRatio = salaryRatio;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getWorkDay() {
		return workDay;
	}

	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}

	public int getYearOfWork() {
		return yearOfWork;
	}

	public void setYearOfWork(int yearOfWork) {
		this.yearOfWork = yearOfWork;
	}
	
	public float getMinimumWage() {
		return minimumWage;
	}

	public void setMinimumWage(int minimumWage) {
		this.minimumWage = minimumWage;
	}

	private Staff(StaffBuilder builder) {
		this.isCreated = false;
		this.id = builder.id;
		this.yearOfBirth = builder.yearOfBirth;
		this.type = builder.type;
		this.name = builder.name;
		this.hometown = builder.hometown;
		this.department = builder.department;
		this.salaryRatio = builder.salaryRatio;
		this.allowance = builder.allowance;
		this.position = builder.position;
		this.workDay = builder.workDay;
		this.yearOfWork = builder.yearOfWork;
		this.minimumWage = builder.minimumWage;
	}
	
	// Builder Class
	
	public static class StaffBuilder {
		private int id;
		private int yearOfBirth;
		private int type;
		private String name;
		private String hometown;
		private String department;
		private String position;
		private int allowance;
		private int workDay;
		private float salaryRatio;
		private int yearOfWork;
		private float minimumWage;
		
		public StaffBuilder (int id, int type) {
			this.id = id;
			this.type = type;
		}
		
		public StaffBuilder setYearOfBirth(int yearOfBirth) {
			this.yearOfBirth = yearOfBirth;
			return this;
		}
	
		public StaffBuilder setName(String name) {
			this.name = name;
			return this;
		}
	
		public StaffBuilder setHometown(String hometown) {
			this.hometown = hometown;
			return this;
		}
	
		public StaffBuilder setDepartment(String department) {
			this.department = department;
			return this;
		}
		
		public StaffBuilder setPosition(String position) {
			this.position = position;
			return this;
		}
	
		public StaffBuilder setQualification(String position) {
			this.position = position;
			return this;
		}
	
		public StaffBuilder setAllowance(int allowance) {
			this.allowance = allowance;
			return this;
		}
	
		public StaffBuilder setWorkDay(int workDay) {
			this.workDay = workDay;
			return this;
		}
	
		public StaffBuilder setSalaryRatio(float salaryRatio) {
			this.salaryRatio = salaryRatio;
			return this;
		}
	
		public StaffBuilder setYearOfWork(int yearOfWork) {
			this.yearOfWork = yearOfWork;
			return this;
		}
		
		public StaffBuilder setMinimumWage(float minimumWage) {
			this.minimumWage = minimumWage;
			return this;
		}
	
		public Staff build() {
			return new Staff(this);
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Staff [hometown=" + hometown + ", department=" + department + ", salaryRatio=" + salaryRatio
				+ ", allowance=" + allowance + ", position=" + position + ", workDay=" + workDay + ", yearOfWork="
				+ yearOfWork + ", minimumWage=" + minimumWage + ", id=" + id + ", yearOfBirth=" + yearOfBirth
				+ ", type=" + type + ", name=" + name + "]";
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name " + ((isCreated) ? this.name : " ") + " ");
		this.name = sc.nextLine();
		
		System.out.println("Enter your birth year " + ((isCreated) ? this.yearOfBirth : " ") + ": ");
		this.yearOfBirth = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter your hometown " + ((isCreated) ? this.hometown : " ") + ": ");
		this.hometown = sc.nextLine();
		
		System.out.println("Enter your department " + ((isCreated) ? this.department : " ") + ": ");
		this.department = sc.nextLine();
		
		System.out.println("Enter your salary ratio " + ((isCreated) ? this.salaryRatio : " ") + ": ");
		this.salaryRatio = Float.parseFloat(sc.nextLine());
		
		System.out.println("Enter your number of working days " + ((isCreated) ? this.workDay : " ") + ": ");
		this.workDay = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter your number of working years " + ((isCreated) ? this.yearOfWork : " ") + ": ");
		this.yearOfWork = Integer.parseInt(sc.nextLine());
		
		minimumWage = Define.DEFAULT_MINIMUM_WAGE;
		
		System.out.println("Choose your position " + ((isCreated) ? this.position : " ") + "\n" +
				   		   "1. Chief of department. \n" +
				           "2. Deputy of department. \n" +
				   	       "3. Employee.");
		int selection = sc.nextInt();
		switch (selection) {
		case Define.TYPE_OF_CHIEF: {
			this.position = Define.POSITION_OF_CHIEF;
			this.allowance = Define.ALLOWANCE_OF_CHIEF;
			break;
		}
		case Define.TYPE_OF_DEPUTY: {
			this.position = Define.POSITION_OF_DEPUTY;
			this.allowance = Define.ALLOWANCE_OF_DEPUTY;
			break;
		}
		case Define.TYPE_OF_EMPLOYEE: {
			this.position = Define.POSITION_OF_EMPLOYEE;
			this.allowance = Define.ALLOWANCE_OF_EMPLOYEE;
			break;
		}
		}
		
		if (!isCreated) isCreated = true;
	}

	@Override
	public void update(float minimumWage) {
		this.minimumWage = minimumWage;
	}

	@Override
	public float getSalary() {
		float salary = (salaryRatio * minimumWage) + allowance + (workDay * 30);
		return salary;
	}

	
}
