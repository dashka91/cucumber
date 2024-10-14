import math
x=eval(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=float(input('введите переменную z:'))
s=((math.exp(abs(x-y))*abs(x-y)**(x+y))/(math.atan(x)+math.atan(z)))+((x**6+math.log(y,math.e)**2)**(1/3))
print(round(s,4))
