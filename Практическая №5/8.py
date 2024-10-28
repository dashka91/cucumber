m=None
s=0
c=0
while True:
    n=int(input())
    if n==0:
        break
    if n==m:
        c+=1
    else:
        s=max(s,c)
        c=1
    m=n
s=max(s,c)
print(s)