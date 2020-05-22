package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		// 코드작성
		if ("음악".equals(str)) {
			this.playMusic();
		} else if ("앱".equals(str)) {
			this.app();
		} else if ("통화".equals(str)) {
			super.execute(str);
		} else {
			System.out.println("잘못 입력하셨습니다. 음악, 앱, 통화 중 하나를 선택해 주세요.");
		}

	}

	// 메소드작성

	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

	// 메소드작성

	public void app() {
		System.out.println("앱실행");
	}

}
