class Solution {
    public int getLucky(String s, int k) {
        String digits = getDigits(s);
        while(k>0){
            digits = transform(digits);
            k--;
        }
        return Integer.valueOf(digits);
    }

    private String getDigits(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            sb.append(c - 'a' + 1);
        }
        return sb.toString();
    }

    private String transform(String digits){
        int sum = 0;
        for(char d : digits.toCharArray()){
             sum += (d - '0');
        }
        return sum + "";
    }

    private String transform_v2(String digits){
        StringBuilder sb = new StringBuilder();
        for(char d : digits.toCharArray()){
             sb.append(d - '0');
        }
        return sb.toString();
    }
}
