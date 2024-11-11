def f(n):
    r=[]
    for m in range(1,n+1):
        d=[int(b) for b in str(m)]
        if all(b!=0 and m%b==0 for b in d):
            r.append(m)
    return r
n=100
print(f(n))