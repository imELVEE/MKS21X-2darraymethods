public class ArrayMethods{

  private static int sum(int[] ary){
    int ans = 0;
    for (int i = 0 ; i < ary.length ; i++){
      ans += ary[i];
    }
    return ans;
  }

  public static int rowSum(int[][] ary, int x){
    return sum(ary[x]);
  }


}
