public class RightMostSetBit {
    public static void main(String[] args) {
        int num = 44; // 101100
        System.out.println(Integer.toBinaryString(num & (-num)).length()); // (num = a1b) where b = 00, a = 101 and then -num = ~a1b(010100) (think by 2's complement) then num&-num = 100
    }
}
