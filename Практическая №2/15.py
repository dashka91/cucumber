import math
x=float(input('введите переменную х:'))
y=eval(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
s=((x**(y+1))+(math.exp(y-1)))/(1+(x*abs(y-math.tan(z))))*(1+abs(y-x))+((abs(y-x)**2)/2)-((abs(y-x)**3)/3)
print(round(s,6))
