package vn.edu.vnuk.sep.model;

import vn.edu.vnuk.sep.controller.Observer;
import java.util.Scanner;
import vn.edu.vnuk.sep.define.Define;

public class Lecturer extends Person implements Observer {	
	private String hometown;
	private String department;
	private String qualification;
	private int allowance;
	private int periodsInMonth;
	private float salaryRatio;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	public int getPeriodsInMonth() {
		return periodsInMonth;
	}

	public void setPeriodsInMonth(int periodsInMonth) {
		this.periodsInMonth = periodsInMonth;
	}

	public float getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(float salaryRatio) {
		this.salaryRatio = salaryRatio;
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

	public void setMinimumWage(float minimumWage) {
		this.minimumWage = minimumWage;
	}

	private Lecturer(LecturerBuilder builder) {
		this.isCreated = false;
		this.id = builder.id;
		this.yearOfBirth = builder.yearOfBirth;
		this.type = builder.type;
		this.name = builder.name;
		this.hometown = builder.hometown;
		this.qualification = builder.qualification;
		this.department = builder.department;
		this.allowance = builder.allowance;
		this.periodsInMonth = builder.periodsInMonth;
		this.salaryRatio = builder.salaryRatio;
		this.yearOfWork = builder.yearOfWork;
		this.minimumWage = builder.minimumWage;
	}
	
	//Builder Class 
	
	public static class LecturerBuilder {
		private int id;
		private int yearOfBirth;
		private int type;
		private String name;
		private String hometown;
		private String department;
		private String qualification;
		private int allowance;
		private int periodsInMonth;
		private float salaryRatio;
		private int yearOfWork;
		private float minimumWage;
	
		public LecturerBuilder(int id, int type) {
			this.id = id;
			this.type = type;
		}
	
		public LecturerBuilder setYearOfBirth(int yearOfBirth) {
			this.yearOfBirth = yearOfBirth;
			return this;
		}
	
		public LecturerBuilder setName(String name) {
			this.name = name;
			return this;
		}
	
		public LecturerBuilder setHometown(String hometown) {
			this.hometown = hometown;
			return this;
		}
	
		public LecturerBuilder setDepartment(String department) {
			this.department = department;
			return this;
		}
	
		public LecturerBuilder setQualification(String qualification) {
			this.qualification = qualification;
			return this;
		}
	
		public LecturerBuilder setAllowance(int allowance) {
			this.allowance = allowance;
			return this;
		}
	
		public LecturerBuilder setPeriodsInMonth(int periodsInMonth) {
			this.periodsInMonth = periodsInMonth;
			return this;
		}
	
		public LecturerBuilder setSalaryRatio(float salaryRatio) {
			this.salaryRatio = salaryRatio;
			return this;
		}
	
		public LecturerBuilder setYearOfWork(int yearOfWork) {
			this.yearOfWork = yearOfWork;
			return this;
		}
		
		public LecturerBuilder setMinimumWage(float minimumWage) {
			this.minimumWage = minimumWage;
			return this;
		}
	
		public Lecturer build() {
			return new Lecturer(this);
		}
	}
	
	

	@Override
	public String toString() {
		return "Lecturer [hometown=" + hometown + ", department=" + department + ", qualification=" + qualification
				+ ", allowance=" + allowance + ", periodsInMonth=" + periodsInMonth + ", salaryRatio=" + salaryRatio
				+ ", yearOfWork=" + yearOfWork + ", minimumWage=" + minimumWage + ", id=" + id + ", yearOfBirth="
				+ yearOfBirth + ", type=" + type + ", name=" + name + "]";
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name " + ((isCreated) ? this.name : " ") + ": ");
		this.name = sc.nextLine();
		
		System.out.println("Enter your birth year " + ((isCreated) ? this.yearOfBirth : " ") + ": ");
		this.yearOfBirth = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter your hometown " + ((isCreated) ? this.hometown : " ") + ": ");
		this.hometown = sc.nextLine();
		
		System.out.println("Enter your department " + ((isCreated) ? this.department : " ") + ": ");
		this.department = sc.nextLine();
		
		System.out.println("Enter your salary ratio " + ((isCreated) ? this.salaryRatio : " ") + ": ");
		this.salaryRatio = Float.parseFloat(sc.nextLine());
		
		System.out.println("Enter your periods in month " + ((isCreated) ? this.periodsInMonth : " ") + ": ");
		this.periodsInMonth = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter your number of working years " + ((isCreated) ? this.yearOfWork : " ") + ": ");
		this.yearOfWork = Integer.parseInt(sc.nextLine());
		
		minimumWage = Define.DEFAULT_MINIMUM_WAGE;
		
		System.out.println("Choose your qualification " + ((isCreated) ? this.qualification : " " ) + "\n" +
						   "1. Bachelor. \n" +
						   "2. Master. \n" +
						   "3. Doctor.");
		int selection = Integer.parseInt(sc.nextLine());
		switch (selection) {
		case Define.TYPE_OF_BACHELOR: {
			this.qualification = Define.QUALIFICATION_OF_BACHELOR;
			this.allowance = Define.ALLOWANCE_OF_BACHELOR;
			break;
		}
		case Define.TYPE_OF_MASTER: {
			this.qualification = Define.QUALIFICATION_OF_MASTER;
			this.allowance = Define.ALLOWANCE_OF_MASTER;
			break;
		}
		case Define.TYPE_OF_DOCTOR: {
			this.qualification = Define.QUALIFICATION_OF_DOCTOR;
			this.allowance = Define.ALLOWANCE_OF_DOCTOR;
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
		float salary = (salaryRatio * minimumWage) + allowance + (periodsInMonth * 45);
		return salary;
	}
}
