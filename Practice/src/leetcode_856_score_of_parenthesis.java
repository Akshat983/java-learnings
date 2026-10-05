package JavaByKK.Practice.src;

public class leetcode_856_score_of_parenthesis {
    public int scoreOfParentheses(String s) {

    }

    public int helper(int st, int end, String s) {
        if(st > end) return 0;

        int c = 0;
        for(int i = st; i <= end; i++) {
            if(s.charAt(i) == '(') c++;
            else c--;
            if(c == 0) {
                if(i == end) {
                    
                }
            }
        }
    }
}
