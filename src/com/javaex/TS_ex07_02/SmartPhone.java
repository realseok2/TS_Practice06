package com.javaex.TS_ex07_02;

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
			System.out.println("잘못입력하셨습니다. 앱, 음악, 통화 중 선택해 주세요.");
		}

	}

	// 메소드작성

	public void app() {
		System.out.println("앱을 실행합니다.");
	}

	// 메소드작성

	public void playMusic() {
		System.out.println("다운로드 후 음악을 자동으로 재생합니다.");
	}

}
