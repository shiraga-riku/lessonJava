public class Average{
	public static void main (String[] args){
		double average=0;
		for(String arg:args){
			average += Double.parseDouble(arg);
		}
		average=average/args.length;
		System.out.println(average);
	}
}