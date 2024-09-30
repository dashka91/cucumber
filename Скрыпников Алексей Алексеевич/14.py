import math
x=eval(input('введите переменную х:'))
y=float(input('введите переменную y:'))
z=eval(input('введите переменную z:'))
s=((y**(x+1))/((abs(y-2))**(1/3)+3))+((x+(y/2))/(2*(abs(x+y))))*((x+1)**((-1)/math.sin(z)))
print(round(s,4))