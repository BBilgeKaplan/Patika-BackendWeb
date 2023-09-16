public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}};
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        // Printing array with For-each loop
        for (int [] i : transpose) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Printing array with For loop
        /* 
        for(int i = 0; i < transpose.length; i++){
            for(int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
        */

    }
}
