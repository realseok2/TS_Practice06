package com.javaex.ex04_TS_01;

public class UserApp {

	public static void main(String[] args) {
		
		User[] uArray = new User[4];
		
		User c01 = new Customer("A", "김철수바보", "김철수", 500);
		User c02 = new Customer("B", "김영희바보", "김영희", 300);
		User e01 = new Employee("A", "김철수바보", "김철수", 5000000);
		User u01 = new User();
		
		uArray[0] = c01;
		uArray[1] = c02;
		uArray[2] = e01;
		uArray[3] = u01;
		
		for(int i = 0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
