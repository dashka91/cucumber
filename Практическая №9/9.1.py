def f(m,k):
  d=m[k][k]
  if d!=0:
    m[k]=[e/d for e in m[k]]
  else:
    print('false')
  return m
m=[[1,2,3],[4,5,6],[7,8,0]]
r=f(m,1)
print(r)
