m=None
c=0
while True:
    n=int(input())
    if n==0:
        break
    if m is not None and n>m:
        c+=1
    m=n
print(c)