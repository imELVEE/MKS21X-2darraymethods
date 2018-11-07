import java.util.Arrays;

public class Driver {
  public static void main(String[] args) {
    int c = 0;
    int[][] square = new int[7][];
    for (int i = 0; i < 7; i++) {
      square[i] = new int[i+3];
      for (int j = 0; j < i+3; j++) {
        square[i][j] = j + 1;
      }
    }


    int[] rowSums = new int[7];
    for (int i = 0; i < 7; i++) {
      rowSums[i] = (i + 3) * (i + 4) / 2;
    }
    int[] colSums = new int[9];
    for (int i = 0; i < 9; i++) {
      if (i < 3) {
        colSums[i] = 7 * (i + 1);
      } else {
        colSums[i] = (9 - i) * (i + 1);
      }
    }


    System.out.println("\nInitialized a 2D array, filled arrays with correct sum values\n");
    System.out.println(".............................................................\n");

    //PART 1
    try {
      for (int i = 0; i < 7; i++) {
        if (ArrayMethods.rowSum(square, i) != rowSums[i]) {
          System.out.println(++c + ") rowSum returns " + ArrayMethods.rowSum(square, i) + " at " + i + " instead of " + rowSums[i] + "!");
        }
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println(++c + ") rowSum should not throw an exception!");
    }

    try {
      for (int i = 0; i < 9; i++) {
        if (ArrayMethods.columnSum(square, i) != colSums[i]) {
          System.out.println(++c + ") columnSum returns " + ArrayMethods.columnSum(square, i) + " at " + i + " instead of " + colSums[i] + "!");
        }
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println(++c + ") columnSum should not throw an exception!");
    }

    //PART 2
    try {
      if (!Arrays.equals(ArrayMethods.allRowSums(square), rowSums)) {
        System.out.println(++c + ") allRowSums returns an incorrect set of values!");
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println(++c + ") allRowSums should not throw an exception!");
    }

    try {
      if (!Arrays.equals(ArrayMethods.allColSums(square), colSums)) {
        System.out.println(++c + ") allColSums returns an incorrect set of values!");
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println(++c + ") allColSums should not throw an exception!");
    }

    //PART 3
    try {
      if (ArrayMethods.isRowMagic(square)) {
        System.out.println(++c + ") isRowMagic should return false!");
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println(++c + ") isRowMagic should not throw an exception!");
    }

    try {
      if (ArrayMethods.isColumnMagic(square)) {
        System.out.println(++c + ") isColumnMagic should return false!");
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println(++c + ") isColumnMagic should not throw an exception!");
    }

    if (c > 0) {
      System.out.println("\nYour code had " + c + " mistakes. Keep trying!\n");
    } else {
      System.out.println("\nYour code had no mistakes. You're good to go!\n");
    }
  }
}
