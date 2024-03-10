class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {

    int rightDiagonalsSum = 0;
    int leftDiagonalSum = 0;
    
    int n = arr.size();
    
    for(int i = 0; i < n; i++) {
        rightDiagonalsSum += arr.get(i).get(i);
    }
    
    for(int i = 0; i < n; i++) {
        leftDiagonalSum += arr.get(i).get(n - 1 - i);
    }
    
    return Math.abs(rightDiagonalsSum - leftDiagonalSum);

    }

}