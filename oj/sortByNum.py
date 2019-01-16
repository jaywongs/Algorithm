def print_list(list_print):
    flag = True
    result = ""
    max = 0
    while flag:
        for i in range(len(list_print)):
            if list_print[i] > list_print[max]:
                max = i
        tmp_count = list_print[max]
        list_print[max] = 0
        if tmp_count == 0:
            flag = False
        for i in range(tmp_count):
            result = result + str(max) + " "
        max = 0
    print(result)


if __name__ == "__main__":
    row = int(input().strip())
    col = int(input().strip())
    while row > 0:
        flag = [0] * 60
        tmp_list = list(map(int, input().strip().split()))
        for val in tmp_list:
            flag[val] += 1
        print_list(flag)
        row -= 1