import java.util.*;

public class leetcode812 {
    public static double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = 0.5 * Math.abs(
                        points[i][0] * (points[j][1] - points[k][1]) +
                        points[j][0] * (points[k][1] - points[i][1]) +
                        points[k][0] * (points[i][1] - points[j][1])
                    );
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    // main method for testing
    public static void main(String[] args) {
        // Example 1
        int[][] points1 = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println("Largest Triangle Area: " + largestTriangleArea(points1));

        // Example 2
        int[][] points2 = {{1,0},{0,0},{0,1}};
        System.out.println("Largest Triangle Area: " + largestTriangleArea(points2));
    }
}
