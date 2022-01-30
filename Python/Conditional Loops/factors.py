num=int(input("Enter Num : "))
factor=0
for val in range(1,num+1):
    if num%val==0:
        print(val)
        factor+=1
print("Total Factors = ",factor)