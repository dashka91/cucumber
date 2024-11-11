n=int(input())
if 1<=n<=9:
    for i in range(1,n+1):
        print(''.join(str(m) for m in range(1,i+1)))
    else:
        print('')