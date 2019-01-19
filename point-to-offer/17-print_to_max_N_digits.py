def print_to_max_N_digits(n):
    if n < 0:
        return

    digits = [0] * n
    print_digits_recursivly(digits, len(digits), 0)


def print_digits_recursivly(digits, length, index):
    if index == length:
        print_digits(digits)
        return

    for i in range(0, 10):
        digits[index] = str[i]
        print_digits_recursivly(digits, length, index + 1)


def print_digits(digits):
    