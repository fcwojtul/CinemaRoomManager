class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int maxRowsIterartor = twoDimArray.length - 1;
        int maxColumnsIterartor = twoDimArray[0].length - 1;
        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][maxColumnsIterartor]);
        System.out.println(twoDimArray[maxRowsIterartor][0] + " " + twoDimArray[maxRowsIterartor][maxColumnsIterartor]);
    }
}