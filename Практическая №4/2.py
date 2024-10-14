A=int(input())
B=int(input())
if A<B:
    for n in range(A,B+1):
        print(n)
else:
    for n in range(A,B-1,-1):
        print(n)
