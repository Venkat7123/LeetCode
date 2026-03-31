class Solution {
    public String generateString(String a, String b) {
        int x = a.length();
        int y = b.length();
        int len = x + y - 1;

        char[] res = new char[len];
        boolean[] lock = new boolean[len];

        for (int i = 0; i < len; i++) res[i] = 'a';

        for (int i = 0; i < x; i++) {
            if (a.charAt(i) == 'T') {
                for (int j = 0; j < y; j++) {
                    int p = i + j;
                    if (p >= len) return "";
                    if (lock[p] && res[p] != b.charAt(j)) return "";
                    res[p] = b.charAt(j);
                    lock[p] = true;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            if (a.charAt(i) == 'F') {
                boolean same = true;
                for (int j = 0; j < y; j++) {
                    if (res[i + j] != b.charAt(j)) {
                        same = false;
                        break;
                    }
                }

                if (same) {
                    boolean changed = false;
                    for (int j = y - 1; j >= 0; j--) {
                        int p = i + j;
                        if (!lock[p]) {
                            res[p] = 'b';
                            changed = true;
                            break;
                        }
                    }
                    if (!changed) return "";
                }
            }
        }

        return new String(res);
    }
}