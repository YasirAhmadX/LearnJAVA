import java.util.Scanner;
public class P6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println("");
        }
        input.close();
    }
}
