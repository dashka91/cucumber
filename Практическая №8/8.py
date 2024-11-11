def f(n):
    if len(n)>1:
        n[0],n[-1]=n[-1],n[0]
m=int(input("Введите длину массива: "))
A=[]
for i in range(m):
    e=int(input(f"Введите элемент {i + 1}: "))
    A.append(e)
print("Исходный массив:",A)
f(A)
print("Массив после замены:",A)