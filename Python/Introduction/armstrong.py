num=input('Enter Number : ')
numlist=list(num)
a=0
exp=len(numlist)
for val in range(exp):
    newnum=int(numlist[val])
    newnumexp=newnum**exp
    a+=newnumexp

if a==int(num):
    print(f'{num} is a armstrong\'s number')
else:
    print(f'{num} is not a armostrong\'s number.')