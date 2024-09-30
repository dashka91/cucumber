import math
x=float(input('введите переменную х:'))
y=eval(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
s=(((9+(x-y)**2)**(1/3))/(x**2+y**2+2))-(math.exp(abs(x-y)))*math.tan(z)**3
print(round(s,5))
