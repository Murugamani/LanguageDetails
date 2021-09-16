package org.lang;

public class LanguageInfo {

	private void language1() {
System.out.println("language1 is tamil");
	}
	
	private void language2() {
System.out.println("language2 is english");
	}
	
	private void language3() {
System.out.println("hindi theriyathu poda");
	}
	
	public static void main(String[] args) {
		LanguageInfo x=new LanguageInfo();
		x.language1();
		x.language2();
		x.language3();
		StateDetails y=new StateDetails();
		y.state1();
		y.state2();
	}
}
