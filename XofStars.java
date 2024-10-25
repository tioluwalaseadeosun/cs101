import java.util.Scanner;
public class Week8Class {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int x1 = 0;
        int x2 = num-1;
        for (int i = 0; i<num; i++){
            for (int j = 0; j<num; j++){
                if(j == x1||j == x2) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            x1++;
            x2--;
            System.out.println();
        }
    }
}
