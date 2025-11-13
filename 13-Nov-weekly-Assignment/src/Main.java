import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("India.txt");
		BufferedReader br = new BufferedReader(f);
		int cnt = 0;
		System.out.println("The contents of file:");
		String line = br.readLine();
		while(line!=null) {
	            int index = 0;

	            while ((index = line.toLowerCase().indexOf("india", index)) != -1) {
	                cnt++;
	                index += "india".length();
	            }
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		System.out.println("India is repeated "+cnt+" times");
	    //functional
		System.out.println("Using functional programming:");
        List<String> allLines = Files.readAllLines(Paths.get("India.txt"));

        long indiaCount= allLines.stream()
                .map(String::toLowerCase)
                .mapToLong(l -> l.split("india", -1).length - 1)
                .sum();
        System.out.println("India is repeated " + indiaCount + " times");
	}

}
