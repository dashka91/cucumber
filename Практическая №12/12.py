N = 12345
def f(n):
    if n>0:
        l=n%10
        print(l)
        f(n // 10)
f(N)
