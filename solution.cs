```C#
using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main()
    {
        Console.Write("Enter a string: ");
        string s = Console.ReadLine();
        Console.Write("Enter number of rows: ");
        int numRows = Convert.ToInt32(Console.ReadLine());

        string result = ConvertToZigZag(s, numRows);
        Console.WriteLine("ZigZag Pattern: " + result);
    }

    static string ConvertToZigZag(string s, int numRows)
    {
        if (numRows == 1) return s;

        List<StringBuilder> rows = new List<StringBuilder>();
        for (int i = 0; i < Math.Min(numRows, s.Length); i++)
            rows.Add(new StringBuilder());

        int curRow = 0;
        bool goingDown = false;

        foreach (char c in s)
        {
            rows[curRow].Append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        foreach (StringBuilder row in rows) ret.Append(row);
        return ret.ToString();
    }
}
```