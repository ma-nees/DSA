import java.util.*;
public class Array {
    public static void main(String[] args) {
        int a = 19;
        String name = "manish";
        int[] rollNo = {1, 2, 3, 4, 5};
        int [] rno=new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<rno.length;i++){
            rno[i]=sc.nextInt();
        }
        for (int i = 0; i < rollNo.length; i++) {
            System.out.println(rollNo[i]);
        }
        for (int i = 0; i < rno.length; i++) {
            System.out.println(rno[i]);
        
        }
       System.out.println(
           Arrays.toString(rno)
       );
        }
    }

