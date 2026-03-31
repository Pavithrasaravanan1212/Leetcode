class Solution {
    public int lengthOfLastWord(String s) {
        String a;
        int len=0;
        a=s.trim();
        System.out.print(a);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == ' ')
            {
                len=0;
            }
            else len++;
        }
        return len;
    }
}
