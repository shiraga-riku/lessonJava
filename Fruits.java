import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Fruits{
	public static void main (String[] args){
		String arg = args[0];
		try {
			File f = new File("fruits.csv");
			BufferedReader br = new BufferedReader(new FileReader(f));
	   
			String[][] data = new String[5][];
      		String line = br.readLine();
      		for (int row = 0; line != null; row++) {
        	data[row] = line.split(",", 0);
        	line = br.readLine();
      		}
			br.close();
			if(data[0][0].equals(arg)){
				System.out.println(data[0][1]);
			} else if(data[1][0].equals(arg)){
				System.out.println(data[1][1]);
			} else if(data[2][0].equals(arg)){
				System.out.println(data[2][1]);
			} else if(data[3][0].equals(arg)){
				System.out.println(data[3][1]);
			} else if(data[4][0].equals(arg)){
				System.out.println(data[4][1]);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}