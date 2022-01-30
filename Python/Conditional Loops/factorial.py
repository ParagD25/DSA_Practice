num=int(input("Enter num : "))
ans=1
for val in range(1,num+1):
    ans*=val
print(f'Factorial of {num} = {ans}')