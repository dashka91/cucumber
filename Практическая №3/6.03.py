a1=int(input('номер столбца 1'))
a2=int(input('номер клетки 1'))
b1=int(input('номер столбца 2'))
b2=int(input('номер клетки 2'))
def f(a1,a2,b1,b2):
    return(a1+b1)%2==(a2+b2)%2
if f(a1,a2,b1,b2):
    print('yes')
else:
    print('no')
