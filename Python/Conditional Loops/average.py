add=0
cnt=0

while True:
    num =int(input('Enter num : '))
    if num==0:
        break
    else:
        add+=num
        cnt+=1
        average=add/cnt
    

print('Average : ',average)