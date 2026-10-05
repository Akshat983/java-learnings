package JavaByKK.Practice.src;

public class leetcode_856_score_of_parenthesis {
    public int scoreOfParentheses(String s) {
        return helper(0, s.length() - 1, s);
    }

    public int helper(int st, int end, String s) {
        if(st > end) return 0;

        int c = 0;
        for(int i = st; i <= end; i++) {
            if(s.charAt(i) == '(') c++;
            else c--;
            if(c == 0) {
                if(i == end) {
                    if(i - 1 == st) return 2;
                    else return (2 * helper(st+1, end-1, s));
                }
                else {
                    if(i - 1 == st) return 2 + helper(i+1, end, s);
                    else {
                        return (2 * helper(st+1, i-1, s)) + helper(i+1, end, s);
                    }
                }
            }
        }
        return 0;
    }
}
