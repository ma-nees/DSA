public class Pattern {
    public static void main(String[] args) {
        int n=5;
        pattern4(n);
    }

    static void pattern1(int n){
// *****
// *****
// *****
// *****
// *****
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
// *
// **
// ***
// ****
// *****
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
// 1
// 12
// 123
// 1234
// 12345
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
static void pattern4(int n){
// * * * * * 
// * * * *
// * * *
// * *
// *
    // outer loop → rows (decreasing)
    for(int i = n; i >= 1; i--){

        // inner loop → stars in each row
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }

        // next line after each row
        System.out.println();
    }
}
static void pattern5(int n){

    for(int i = n; i >= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

    
}
