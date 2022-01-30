num=int(input("Enter Num : "))
prod=1
sum=0
while num>0:
    prod*=(num%10)
    sum+=(num%10)
    num=num//10
ans=prod-sum
print('Answer = ',ans)
