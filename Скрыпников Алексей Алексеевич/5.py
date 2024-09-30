import math
x=float(input('введите переменную х:'))
y=eval(input('введите переменную y:'))
z=int(input('введите переменную z:'))
s=(math.log(y**(-(abs(x)**(1/2))))*(x-(y/2))+(math.sin(math.atan(z))**2))
print(round(s,3))
