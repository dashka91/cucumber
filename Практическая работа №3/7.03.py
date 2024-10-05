n=int(input('введите год'))
def f(n):
    if(n%4==0 and n%100!=0) or (n%400==0):
        return 'да'
    else:
        return 'нет'
print(f(n))