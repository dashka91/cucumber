def f(m):
    n=len(m)
    t=[[0]*n for v in range(n)]
    for i in range(n):
        for j in range(n):
            t[j][i]=m[i][j]
    return t
m=[[1,2,3],[4,5,6],[7,8,9]]
f=f(m)
for r in f:
    print(r)
