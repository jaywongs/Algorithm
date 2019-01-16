import sys
def Hanoi(disks):
    if disks == 1:
        return 2
    n = 2
    for i in range(disks - 1):
        n = 3 * n + 2
    return n

disks = sys.stdin.readline()
print(Hanoi(int(disks)))