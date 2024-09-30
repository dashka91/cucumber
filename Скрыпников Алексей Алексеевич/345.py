import math
x=eval(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
s=((1+(math.sin(x+y))**2)/(abs(x-((2*y)/(1+x**2*y**2)))))*x**abs(y)+(math.cos(math.atan(1/z)))**2
print(round(s,5))