s=0
c=0
while True:
    n=int(input())
    if n==0:
        break
    s+=n
    c+=1
if c>0:
    b=s/c
    print(b)
else:
    print()