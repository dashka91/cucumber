a=int(input())
b=int(input())
l=int(input())
N=int(input())
def f(a,b,l,N):
    t=2*a*N    #вертикальная длина
    m=b*(N-1)  #горизонтальная длина
    v=t+m+l    #общая длина
    return v
print(f(a,b,l,N))