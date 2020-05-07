public class Calc{
	public static void main (String[] args){
		String operater=args[0];
		int num1=Integer.parseInt(args[1]);
		int num2=Integer.parseInt(args[2]);
		if (operater.equals("+")){
			System.out.println(num1+num2);
		} else if (operater.equals("-")){
			System.out.println(num1-num2);
		} else if (operater.equals("m")){
			System.out.println(num1*num2);
		} else if (operater.equals("/")){
			System.out.println(num1/num2);
		}
	}
}