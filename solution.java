Here is a Java console application that converts a string into a zigzag pattern based on a given number of rows:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        System.out.println("Enter number of rows:");
        int numRows = scanner.nextInt();
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}
```

This application first asks the user to input a string and the number of rows for the zigzag pattern. It then calls the `convert` method to convert the string into a zigzag pattern. The `convert` method uses a list of `StringBuilder` objects to store each row of the zigzag pattern. It iterates over the characters of the string, appending each character to the appropriate row. The direction of traversal (up or down the rows) is determined by the current row and the number of rows. The rows are then concatenated into a single string and returned.