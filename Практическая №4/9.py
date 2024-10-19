N=int(input())
def f(n):
    a,b=0,1
    summa=0
    for i in range(n):
        summa+=a
        a,b=b,a+b
    return summa
if N>0:
    r=f(N)
    print(f'сумма {N} чисел Фибоначчи равна: {r}')
else:
    print('введите число больше 0')