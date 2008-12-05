alloc 2
pushloc 0
mkvec 1
mkclos L1
jump L2
L1:
loadc 1
jumpz L3
mark L5
mkvec 0
mkclos L6
jump L7
L6:
loadc 2
mkbasic
update
L7:
pushglob 0
eval
apply
L5:
jump L4
L3:
mark L8
mkvec 0
mkclos L9
jump L10
L9:
loadc 5
mkbasic
update
L10:
pushglob 0
eval
apply
L8:
L4:
update
L2:
rewrite 2
mkvec 0
mkclos L11
jump L12
L11:
mkvec 0
mkfunval L13
jump L14
L13:
targ 1
pushloc 0
eval
getbasic
loadc 1
add
mkbasic
return 1
L14:
update
L12:
rewrite 1
pushloc 1
eval
slide 2
halt
