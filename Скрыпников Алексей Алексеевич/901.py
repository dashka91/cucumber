import math
x=eval(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
s=(abs(x**(y/x)-((y/x)**(1/3)))+(y-x)*((math.cos(y)-(z/(y-x)))/(1+((y-x)**2))))
print(round(s,5))