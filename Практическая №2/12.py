import math
x=float(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
s=(2**(y**x))+((3**x)**y)-((y*(math.atan(z)-(1/3)))/(abs(x)+(1/((y**2)+1))))
print(round(s,5))
