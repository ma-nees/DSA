public class strings {
    public static void main(String[] args) {

        // String literals → stored in String Pool
        String str = "Hello, World!";
        String str2 = "Hello, World!";
        // Both str and str2 point to the SAME object in String Pool

        // new String() → forces creation of NEW objects in Heap
        String str3 = new String("manish");
        String str4 = new String("manish");
        // str3 and str4 have SAME content but DIFFERENT memory locations

        // == compares references (memory address)
        System.out.println(str == str2);     
        // true → because both refer to the SAME string pool object

        System.out.println(str3 == str4);    
        // false → because new creates two DIFFERENT objects in Heap

        // equals() compares content (character by character)
        System.out.println(str3.equals(str4));
        // true → because both contain the SAME text "manish"
        System.out.println(99);
    }
}
