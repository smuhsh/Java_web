package app.labs.servlet.bean;

public class CalcService {
	private int result = 0;
	
	public CalcService(int num1, int num2, String opt) {
		if(opt.equals("+")) {
			result = num1+num2;
		}
		else if (opt.equals("-")) {
			result = num1-num2;
		}
		else if (opt.equals("*")) {
			result = num1*num2;
		}
		else if (opt.equals("/")) {
			result = num1/num2;
		}
	}
	
	public int getResult() {
		return result;
	}
}
