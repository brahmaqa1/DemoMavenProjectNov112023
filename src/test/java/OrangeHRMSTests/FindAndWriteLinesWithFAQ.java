package OrangeHRMSTests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FindAndWriteLinesWithFAQ {
    public static void main(String[] args) {
        String inputFilePath = "C:\\brahma\\videos\\Interview All notes\\techVision Notes\\imp\\Techvision Latest Notes\\backup\\Selenium Part1 notes\\backup for Next class\\Selenium  Notes Final\\Bakcup Notes\\Java Notes Jul 19 2023.txt";
        String outputFilePath = "C:\\brahma\\videos\\Interview All notes\\techVision Notes\\imp\\Techvision Latest Notes\\backup\\Selenium Part1 notes\\backup for Next class\\Selenium  Notes Final\\Bakcup Notes\\JAVAFAQByTopicWise.txt";

//        Takessc
        
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
int i=0;
            String line;
            while ((line = br.readLine()) != null) {
                // Check if the line contains "FAQ"
                if (line.contains("FAQ") || line.contains("faq")) {
                    // Write the line to the output file
                	i++;
                	 line = line.replace("//", " ");
                	String  line1 = i+"."+ line.trim();
                	System.out.println( line1);
                    bw.write(line1.trim());
                    bw.newLine(); // Add a newline to separate lines in the output file
                }
            }
            System.out.println("Lines containing 'FAQ' have been written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
