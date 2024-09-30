import math
x=eval(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=float(input('введите переменную z:'))
s=(math.sqrt((x**(1/3))+(x**(y+2)))*(10**(1/2)))*(math.asin(z)**2-abs(x-y))
print(round(s,4))
