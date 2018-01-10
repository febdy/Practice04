package com.javaex.problem03;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		if (str.equals("앱"))
			runApp();
		else if (str.equals("음악"))
			playMusic();
		else
			super.execute(str);

	}

	protected void runApp() {
		System.out.println("앱실행");
	}

	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

}
