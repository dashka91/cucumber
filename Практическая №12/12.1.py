def f():
    count=0
    while True:
        n=int(input())
        if n==0:
            break
        count +=1
        if count %2==1:
            print(n)
f()
