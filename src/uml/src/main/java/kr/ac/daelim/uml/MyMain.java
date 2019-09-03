package kr.ac.daelim.uml;

public class MyMain {
	public static void main(String[] args) {
		SampleClass s  = SampleClass.getInsatnce();		
		s.samplePrint();	
		//
		//복잡한 로직
		//
		s = SampleClass.getInsatnce();
		s.samplePrint();
	}
}
