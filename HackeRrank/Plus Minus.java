class Result {
    public static void plusMinus(List<Integer> arr) {
    int total = arr.size();
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;
    
    for(int num : arr) {
        if(num>0) {
            positiveCount++;
        } else if(num<0) {
            negativeCount++;
        } else {
            zeroCount++;
        }
    }
    
    double positiveRatio = (double) positiveCount/total;
    double negativeRatio = (double) negativeCount/total;
    double zeroRatio = (double) zeroCount/total;
    
    System.out.printf("%.6f\n",positiveRatio);
    System.out.printf("%.6f\n",negativeRatio);
    System.out.println(String.format("%.6f", zeroRatio));
    }
}
