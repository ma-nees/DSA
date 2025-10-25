
import java.util.*;


public class arraylst {
	public static void main(String [] args) {
	// ArrayList<Integer> al =new ArrayList<>();
	// Scanner in=new Scanner (System.in);
	// al.add(1);
	// al.add(15);
	
	// al.add(13);
	// //intput
	// // for(int i=0;i<5;i++) {
	// // 	al.add(in.nextInt());
	// // }
	// for (int i=0; i<5;i++){
	// 	System.out.println(al.get(3));
	// }
	//  System.out.println(al);   
	
	
	// multi arraylist
	//initalisation
	ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	for (int i=0;i<3;i++){
		list.add(new ArrayList<>());
	}
	//adding 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter:");
	for (int i=0;i<3;i++){
		for(int j=0;j<3;j++){
				list.get(i).add(sc.nextInt());
		}
	}
	System.out.println(list);
}
}