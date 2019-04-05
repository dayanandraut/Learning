    // method to convert character of roman into integer
    public int toInt(char x){
        int r = 0;
            switch(x){
                case 'I':
                    r = 1;
                    break;
                case 'V':
                    r = 5;
                    break;
                case 'X':
                    r = 10;
                    break;
                case 'L':
                    r = 50;
                    break;
                case 'C':
                    r = 100;
                    break;
                case 'D':
                    r = 500;
                    break;
                case 'M':
                    r = 1000;
                    break;
                default:
                    break;
            }
            return r;
    }
    
    // iterating through each character and calculating the equivalent integer value
    public int romanToInt(String A) {
            int res = 0;
            int previous = toInt(A.charAt(0));
            for(int i=1;i<A.length();i++){
                int t = toInt(A.charAt(i));
                if(previous<t) res -= previous;
                else res += previous;
                previous = t;
            }
            return res+previous;
    }
