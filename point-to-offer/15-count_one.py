def count_one(x):
    count = 0
    while x:
        count += 1
        x = x & (x - 1)
    return count


if __name__ == '__main__':
    print(count_one(767))