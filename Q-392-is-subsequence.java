class Solution {
  public boolean isSubsequence(String s, String t) {
      int ps = 0, pt = 0; // pointers

      while(ps < s.length() && pt < t.length()) {
          if(s.charAt(ps) == t.charAt(pt)) ps++;
          pt++;
      }

      return ps == s.length();
  }
}