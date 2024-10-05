n=int(input())
m=int(input())
k=int(input())
def f(n,m,k):
    if(k%n==0 or k%m==0)and(k<=n*m):
        return 'yes'
    else:
        return 'no'
print(f(n,m,k))