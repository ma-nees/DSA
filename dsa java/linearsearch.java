import java.util.*;
public class linearsearch {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter terget element");
        int tar=sc.nextInt();
        for ( int a=0;a<arr.length;a++){
            if (arr[a]==tar){
                System.out.println("target  "+tar+" found at index "+a);    
                break;
            }
        }
    }
}
