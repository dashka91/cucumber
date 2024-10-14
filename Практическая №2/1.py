import math
x=float(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
a=(2*math.cos(x-2/3))/(1/2+math.sin(y)**2)*(1+((z**2)/(3-z**2/5)))
print(round(a,6))

