import java.util.*;
public class linearsstring {
    public static void main(String[] args) {
        String name = "manish";
        char target = 'i';  
        // System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false; 
        }

        for(char ch: str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false; // not found
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false; 
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true; // found the character
            }
        }
        return false; // not found
    }
}
