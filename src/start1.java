public class start1 {
  public int start1(int[] a, int[] b) {
    int counta = 0;
    int countb = 0;
    if (a.length != 0) {
      if (a[0] == 1) {
        counta++;
      }
    }
    if (b.length != 0) {
      if (b[0] == 1) {
        countb++;
      }
    }
    return counta + countb;
  }
}
