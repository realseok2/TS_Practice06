package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {

		User[] uArray = new User[4];

		User c01 = new Customer("abc", "a1234", "김철수", 1000);
		User c02 = new Customer("abc", "a1234", "김철수", 1000);
		User e01 = new Employee("abc", "a1234", "운영자", 5000000);
		User u01 = new User();

		uArray[0] = c01;
		uArray[1] = c02;
		uArray[2] = e01;
		uArray[3] = u01;

		for (int i = 0; i < uArray.length; i++) {
			uArray[i].showInfo();
		}

	}

}
