package model;

public class Customer {
	
	//Variables 
	private int age;
	private String name;
	private int numOfTransactions; 
	private int numOfYearsSignedUp;
	
	//Constructors
	public Customer() {
		
	}
	public Customer(String name) {
		this.name = name; 
	}
	//Getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfTransactions() {
		return numOfTransactions;
	}
	public void setNumOfTransactions(int numOfTransactions) {
		this.numOfTransactions = numOfTransactions;
	}
	public int getNumOfYearsSignedUp() {
		return numOfYearsSignedUp;
	}
	public void setNumOfYearsSignedUp(int numOfYearsSignedUp) {
		this.numOfYearsSignedUp = numOfYearsSignedUp;
	}
	
}

