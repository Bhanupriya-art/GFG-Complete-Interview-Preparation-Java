class Geeks {
    static int follPatt(String s) {
        int countX = 0, countY = 0, i = 0;
        while (i < s.length()) {
            int cx = 0, cy = 0;
            while (i < s.length() && s.charAt(i) == 'x') {
                cx++;
                i++;
            }
            while (i < s.length() && s.charAt(i) == 'y') {
                cy++;
                i++;
            }
            if (cx != cy || cx == 0 || cy == 0)
                return 0;
        }
        return 1;
    }
}
