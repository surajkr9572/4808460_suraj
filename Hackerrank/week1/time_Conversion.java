public static String timeConversion(String s) {
        boolean timeFlag=false;
        if(s.endsWith("AM")){
            timeFlag=true;
        }
        s=s.substring(0,s.length()-2);
        int hours=Integer.valueOf(s.substring(0,2));
        if(timeFlag && hours==12){
            return "00".concat(s.substring(2));
        }
        else if (!timeFlag && hours != 12) {
            return Integer.toString(hours + 12).concat(s.substring(2));
        } else {
            return s;
        }
    }