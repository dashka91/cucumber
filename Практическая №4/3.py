a=int(input())
b=int(input())
if a>b:
    for n in range(a,b-1,-1):
        if n%2!=0:
            print(n)
else:
    print('error')
