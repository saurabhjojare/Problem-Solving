class Result {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxHeight = 0;
        
        for (int candle : candles) {
            if(candle > maxHeight) {
                maxHeight = candle;
            }
        }
        
        int tallestCount = 0;
        for(int candle : candles) {
            if(candle == maxHeight) {
                tallestCount++;
            }
        }
        return tallestCount;
    }
}
