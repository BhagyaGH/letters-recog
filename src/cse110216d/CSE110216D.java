package cse110216d;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class CSE110216D {

	public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("--------Character Recognition System--------\nDFA\n");
             
            String seq;
            String unicode_letter, letter;
            
                System.out.println("Enter the sequence of directions : ");
                seq = input.nextLine();
                
                unicode_letter = "";   
                letter = "";
                
                switch(seq) {
                    case "013211200013":
                        unicode_letter = "\u0D85";
                        letter = "Ayanna";
                        break;
                    case "013211200013123":
                        unicode_letter = "\u0D86";
                        letter = "Aayanna";
                        break;
                    case "0112332300112":
                        unicode_letter = "\u0D9A";
                        letter = "Kayanna";
                        break;
                    case "0112300112":
                        unicode_letter = "\u0DB1";
                        letter = "Nayanna";
                        break;
                    case "013110332":
                        unicode_letter = "\u0DC0";
                        letter = "Vayanna";
                        break;
                    case "1231120332":
                        unicode_letter = "\u0DB6";
                        letter = "Bayanna";
                        break;
                    default:
                        unicode_letter = "";
                        letter = "";
                        break;
                }
             
            if(!unicode_letter.equals("")) {
                
                System.out.println("Directional Sequence is Accepted!\nCheck ResultOutput.txt for the character!");
                System.out.println(letter);
                try {
                    FileOutputStream fos = new FileOutputStream("ResultOutput.txt");
                    Writer out = new OutputStreamWriter(fos, "UTF8");
                    out.write(unicode_letter);
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Directional Sequence is Rejected!");
            }
        }

}