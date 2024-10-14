import math
x=float(input('введите переменную х:'))
y=eval(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
s=((y+((x-1)**(1/3)))**(1/4))/(abs(x-y)*(math.sin(z)**2+math.tan(z)))
print(round(s,6))
