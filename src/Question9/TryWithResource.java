package Question9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String args[]) {
		try(BufferedReader b = new BufferedReader(new FileReader("names.txt"))){
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
