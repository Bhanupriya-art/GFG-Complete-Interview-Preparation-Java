class Solution {
    public static boolean isRotated(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.length() <= 2) return s1.equals(s2);
        
        String clockwise = s1.substring(2) + s1.substring(0, 2);
        String anticlock = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);
        
        return s2.equals(clockwise) || s2.equals(anticlock);
    }
}
