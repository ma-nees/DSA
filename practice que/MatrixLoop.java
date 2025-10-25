public class MatrixLoop {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
            int target=8;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j]==target){
                        System.out.println("found at "+i+","+j);
                    }
                }
            }
        
    }}
