public class driver{
  public static void main(String[] args){

    int[][] test = new int[4][3];

    for (int i = 0 ; i < test.length ; i++){
      for (int e = 0 ; e < test[i].length ; e++){
        test[i][e] = (i + e) * 2;
      }
    }

    System.out.println("\n//should print out 6");
    System.out.println(ArrayMethods.rowSum(test, 0));

    System.out.println("\n//should print out 12");
    System.out.println(ArrayMethods.rowSum(test, 1));

    System.out.println("\n//should print out 18");
    System.out.println(ArrayMethods.rowSum(test, 2));
  }
}
