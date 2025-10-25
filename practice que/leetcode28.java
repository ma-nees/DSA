public class leetcode28 {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle ="sad";
        System.out.println(match(haystack,needle));
    }
    public static int match(String haystack,String needle){
        return haystack.indexOf(needle);
    }
}
