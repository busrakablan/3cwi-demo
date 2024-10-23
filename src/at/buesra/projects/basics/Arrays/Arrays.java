package at.buesra.projects.basics.Arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] throwsArray = new int[6];
        System.out.println(throwsArray[4]);

        throwsArray[4] = 9;
        for (int i = 0; 1< throwsArray.length; i++){
            System.out.print(throwsArray[i] + " ");

            int[][] playground = new int [3][3];
            playground[0][0] = 1;
            playground[2][1] = 2;

            for (int row = 0; i < playground.length; row++) {
                for (int col = 0; col < playground.length; col++) {
                    System.out.print(playground[row][col] + " ");
                }

                System.out.println();
            }
        }
    }
}
