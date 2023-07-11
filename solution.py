Here is a Python console application that converts a string into a zigzag pattern based on a given number of rows:

```python
def convert_to_zigzag(input_string, num_rows):
    if num_rows == 1 or num_rows >= len(input_string):
        return input_string

    res = ['' for _ in range(num_rows)]
    index, step = 0, 1

    for char in input_string:
        res[index] += char

        if index == 0:
            step = 1
        elif index == num_rows - 1:
            step = -1

        index += step

    return ''.join(res)


def main():
    input_string = input("Enter a string: ")
    num_rows = int(input("Enter the number of rows: "))
    print(convert_to_zigzag(input_string, num_rows))


if __name__ == "__main__":
    main()
```

You can run this console application, it will ask you to enter a string and the number of rows. Then it will print the zigzag pattern of the string based on the given number of rows.