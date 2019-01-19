def power(base, exponent):
    if base == 0 and exponent == 0:
        return None
    if exponent < 0:
        return 1.0 / unsigned_power(base, abs(exponent))
    else:
        return unsigned_power(base, exponent)


def unsigned_power(base, unsigned_exponent):
    if unsigned_exponent == 0:
        return 1
    if unsigned_exponent == 1:
        return base

    result = unsigned_power(base, unsigned_exponent >> 1)
    result *= result
    if unsigned_exponent & 1 == 1:
        result *= base

    return result


if __name__ == '__main__':
    print(power(2, -3))