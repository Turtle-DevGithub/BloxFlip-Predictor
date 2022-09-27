
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Predictor(s);
    }
    public static void Predictor(String round_id) {
        int round_length = round_id.length();
        if (round_length < 36) {
            System.out.println("Invalid round ID");
        } else if (round_length == 36) {
            int a = (int)Math.floor(Math.random()*(8-1+1)+1);
            int b = (int)Math.floor(Math.random()*(13-9+1)+9);
            int c = (int)Math.floor(Math.random()*(17-14+1)+14);
            int d = (int)Math.floor(Math.random()*(25-18+1)+18);
            if (a == 1) {
                System.out.println("A1");
            }  if (a == 2) {
                System.out.println("A2");
            }  if (a == 3) {
                System.out.println("A3");
            }  if (a == 4) {
                System.out.println("A4");
            }  if (a == 5) {
                System.out.println("A5");
            }  if (a == 6) {
                System.out.println("B1");
            }  if (a == 7) {
                System.out.println("B2");
            }  if (a == 8) {
                System.out.println("B3");
            }  if (b == 9) {
                System.out.println("B4");
            }  if (b == 10) {
                System.out.println("B5");
            }  if (b == 11) {
                System.out.println("C1");
            }  if (b == 12) {
                System.out.println("C2");
            }  if (b == 13) {
                System.out.println("C3");
            }  if (c == 14) {
                System.out.println("C4");
            }  if (c == 15) {
                System.out.println("C5");
            }  if (c == 16) {
                System.out.println("D1");
            }  if (c == 17) {
                System.out.println("D2");
            }  if (d == 18) {
                System.out.println("D3");
            }  if (d == 19) {
                System.out.println("D4");
            }  if (d == 20) {
                System.out.println("D5");
            }  if (d == 21) {
                System.out.println("E1");
            }  if (d == 22) {
                System.out.println("E2");
            }  if (d == 23) {
                System.out.println("E3");
            }  if (d == 24) {
                System.out.println("E4");
            }  if (d == 25) {
                System.out.println("E5");
            }
            
        }
        }
        
        
    }

