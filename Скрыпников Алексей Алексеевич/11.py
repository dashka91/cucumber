import math

x=float(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=float(input('введите переменную z:'))
s = (y**abs(x)**(1/3))+(math.cos(y)**3)*((abs(x-y))*((1+math.pow(math.sin(z), 2)/(math.pow(x+y,1/2))))/(math.exp(abs(x-y))+(x/2)))
print(round(s,6))