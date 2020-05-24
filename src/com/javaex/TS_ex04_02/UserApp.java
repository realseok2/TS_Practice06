package com.javaex.TS_ex04_02;

public class UserApp {

	public static void main(String[] args) {

		User[] u = new User[4];

		User c01 = new Customer("JWS123", "wsj123", "정우성", 3000);
		User c02 = new Customer("LJJ123", "jjl123", "이정재", 8000);
		User e01 = new Employee("Master", "Master123", "운영자", 5000000);
		User u01 = new User();

		u[0] = c01;
		u[1] = c02;
		u[2] = e01;
		u[3] = u01;

		for (int i = 0; i < u.length; i++) {
			u[i].showInfo();
		}

	}

}
