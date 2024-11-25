def f(n):
    with open(n) as p:
        return [list(map(int, line.split())) for line in p]
def w(n,m):
    with open(n,'w') as p:
        for r in m:
            p.write(' '.join(map(str,r))+'\n')
input_file='Чугуевская_у-245.txt'
output_file='Чугуевская_у-245.txt'
m=f(input_file)
t=[list(r) for r in zip(*m)]
w(output_file,t)
