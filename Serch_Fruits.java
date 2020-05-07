import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Serch_Fruits{
	public static void main (String[] args){
		int arg = Integer.parseInt(args[0]);
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
			int x=0;
			while (x<=data.length-1) {
				if(arg<=Integer.parseInt(data[x][1])){
					System.out.println(data[x][0]);
				}
				x++;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}