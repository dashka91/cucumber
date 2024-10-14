import math
x=eval(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
s=((abs(math.cos(x)-math.cos(y))**(1+2*math.sin(y)**2)*(1+z+(z**2/2)+(z**3/3)+(z**4/4))))
print(round(s,5))
