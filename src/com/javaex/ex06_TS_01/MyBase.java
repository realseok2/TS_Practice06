package com.javaex.ex06_TS_01;

public class MyBase extends Base {

	// 코드작성

	public void service(String state) {

		if (state.equals("낮")) {
			this.day();
		} else if (state.equals("밤")) {
			super.night();
		} else if (state.equals("오후")) {
			this.afternoon();
		} else {
			System.out.println("잘못 입력하셨습니다. 낮, 밤, 오후 중 선택하여 입력해 주세요.'");
		}

	}

	public void day() {
		System.out.println("낮에는 열심히 수업을 듣자.");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 열심히 공부해야 합니다.");
	}

}
