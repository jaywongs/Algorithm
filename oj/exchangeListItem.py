#coding=utf-8

import sys
from itertools import combinations


def mean(l):
    average = sum(l) / 2
    all = list(combinations(l, int(len(l) / 2)))
    res = []
    minm = abs(average - sum(all[0]))
    for listt in all:
        if abs(average - sum(listt)) <= minm:
            minm = abs(average - sum(listt))
            res = listt
    print(res)
    ans = abs(sum(l) - sum(res) - sum(res))
    return ans

def f1(a,b):
    c=a+b
    d={}
    x=defult=abs(sum(c))/2
    for i in combinations(c,len(a)):
        y=abs(abs(sum(i))-abs(defult))
        x=min(y,x)
        if x==y:d[y]=list(i)
    a=d[x]
    for j in a:c.remove(j)
    return abs(sum(a)-(sum(c))) * 2


li = [int(n) for n in sys.stdin.readline().strip().split()]
l = [int(n) for n in sys.stdin.readline().strip().split()]
l.extend(li)
print(mean(l))
# print(f1(li,l))

#########
a=list(map(int ,input().split()))
b=list(map(int ,input().split()))
len=len(a)
flag=True
while flag==True:
    sa=sum(a)
    sb=sum(b)
    A=sa-sb
    diff=float('inf')
    if A>=0:
        m,n=-1,-1
        for i in range(len):
            for j in range(len):
                x=a[i]-b[j]
                if 0<x<A and diff>abs(x-A/2):
                    diff=abs(x-A/2)
                    m,n=i,j
        if m==-1:
            flag=False
        else:
            a[m],b[n]=b[n],a[m]
    if A<0:
        m,n=-1,-1
        for i in range(len):
            for j in range(len):
                x=a[i]-b[j]
                if A<x<0 and diff>abs(x-A/2):
                    flag=True
                    diff=abs(x-A/2)
                    m,n=i,j
        if m==-1:
            flag=False
        else:
            a[m],b[n]=b[n],a[m]
res=sum(a)-sum(b)
print(res)