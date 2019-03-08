dict = {}


def get_val(i,x,y):
    if (i,x,y) in dict:
        return dict[(i,x,y)]
    if(i==0):
        if(x==0):
            dict[(i,x,y)] = b[i]
        elif (y==0):
            dict[(i,x,y)] = a[i]
        else:
            dict[(i,x,y)] = max(a[i],b[i])
        return dict[(i,x,y)]
    if(x==0):
        dict[(i,x,y)] = b[i]+get_val(i-1,x,y-1)
    elif y==0:
        dict[(i,x,y)] = a[i]+get_val(i-1,x-1,y)
    else:
        dict[(i,x,y)] = max(a[i]+get_val(i-1,x-1,y), b[i]+get_val(i-1,x,y-1))
    return dict[(i,x,y)]


n = input()
while True:
    try:
        arr = [int(n) for n in input().split()]
        a = [int(n) for n in input().split()]
        b = [int(n) for n in input().split()]
        n, x, y = arr[0], arr[1], arr[2]
        print(get_val(n-1, x, y))
    except EOFError:
        break