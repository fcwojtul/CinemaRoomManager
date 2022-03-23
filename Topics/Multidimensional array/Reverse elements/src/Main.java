
class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        int[] tmpArray;
        for (int i = 0; i < twoDimArray.length; i++) {
            tmpArray = twoDimArray[i].clone();
            for  (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = tmpArray[twoDimArray[i].length - j - 1];
            }
        }
    }
}
