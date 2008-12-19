alloc 1
mkvec 0
mkclos L1
jump L2
L1:
mkvec 0
mkfunval L3
jump L4
L3:
targ 0
loadc 1
mkbasic
loadc 2
mkbasic
loadc 3
mkbasic
mkvec 3
getvec 3
pushloc 0
eval
getbasic
pushloc 0
eval
getbasic
add
pushloc -1
eval
getbasic
add
mkbasic
slide 3
return 0
L4:
update
L2:
rewrite 1
mark L5
pushloc 3
eval
apply
L5:
slide 1
halt
