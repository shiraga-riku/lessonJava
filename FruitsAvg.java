import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class FruitsAvg{
	public static void main (String[] args){
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
			int y=0;
			for (String arg:args){
				if(data[y][0].equals(arg)){
					x+=Integer.parseInt(data[y][1]);
					y++;
				}
			}
			System.out.println(x/y);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}