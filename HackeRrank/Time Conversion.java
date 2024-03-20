class Result {
    public static String timeConversion(String s) {
       DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
       DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
       
       try{
           Date date = inputFormat.parse(s);
           String convertedTime = outputFormat.format(date);
           return convertedTime;
       } catch(ParseException e) {
           return "Invalid Input Format";
       }

    }
}
