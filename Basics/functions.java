package JavaByKK;
class functons {
    static int max(int ...v) {
        int l = v.length;
        int m = 0;
        while (--l >= 0) {
            if (v[l] > m)
                m = v[l];
        }
        return m;
    }

    public static void main(String[] args) {
        int m=max(234,34,56,5424,4252,456,42,345,25,4325,2,1232144);
        System.out.println("Max : "+m);
    }
}
