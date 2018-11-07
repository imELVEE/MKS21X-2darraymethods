public class ArrayMethods{

  private static int sum(int[] ary){
    int ans = 0;
    for (int i = 0 ; i < ary.length ; i++){
      if (ary[i] == 0)
        ans += 0;
      else
        ans += ary[i];
    }
    return ans;
  }

  public static int rowSum(int[][] ary, int x){
    if (x < ary.length)
      return sum(ary[x]);
    return 0;
  }

  public static int[][] colConvert(int[][] ary){
    int[][] ans = new int[0][0];
    for (int i = 0 ; i < ary.length ; i++){
      if (ary[i].length > ans.length)
        ans = new int[ary[i].length][ary.length];
    }

    for (int ocol = 0 ; ocol < ans.length ; ocol++){
      for (int orow = 0 ; orow < ary.length ; orow++){
        ans[ocol][orow] = ary[orow][ocol];
      }
    }
    return ans;
  }

  public static int columnSum(int[][] ary, int x){
    if (x < colConvert(ary).length)
      return rowSum(colConvert(ary), x);
    return 0;
  }

  public static int[] allRowSums(int[][] ary){
    int[] sums = new int[ary.length];
    for (int i = 0 ; i < sums.length ; i++){
      sums[i] = rowSum(ary, i);
    }
    return sums;
  }

  public static int[] allColSums(int[][] ary){
    int[] sums = new int[ary[0].length];
    for (int i = 0 ; i < sums.length ; i++){
      sums[i] = columnSum(ary, i);
    }
    return sums;
  }

  public static boolean isRowMagic(int[][] ary){
    int[] rowSums = allRowSums(ary);
    for (int i = 0 ; i < rowSums.length ; i++){
      if (rowSums[0] != rowSums[i])
        return false;
    }
    return true;
  }

  public static boolean isColumnMagic(int[][] ary){
    int[] colSums = allColSums(ary);
    for (int i = 0 ; i < colSums.length ; i++){
      if (colSums[0] != colSums[i])
        return false;
    }
    return true;
  }
}
