n=int(input())
def f(n):
    summa=0
    r=1
    for i in range(1,n+1):
        r *=i
        summa += r
    return summa
print(f'сумма факториалов равна {f(n)}')