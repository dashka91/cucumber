import math
x=float(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
s=5*math.atan(x)-1/4*math.acos(x)*((x+3*abs(x-y)+x**2)/(abs(x-y)*z+x**2))
print(round(s,3))