import java.util.Arrays;
public class Sort{
	public static void main (String[] args){
		int x = 0;
		int y = args.length;
		double[] f = new double[y];
		for(String arg:args){
			f[x] = Double.parseDouble(arg);
			x++;
		}
		Arrays.sort(f);
		for(double sort:f){
			System.out.print(sort+" ");
		}
	}
}