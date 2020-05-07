public class Average{
	public static void main (String[] args){
		double average=0;
		int x=0;
		for(String arg:args){
			average += Double.parseDouble(arg);
			x++;
		}
		average=average/x;
		System.out.println(average);
	}
}