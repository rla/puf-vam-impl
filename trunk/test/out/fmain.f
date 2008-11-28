alloc 2
pushloc 0
mkvec 1
mkclos L1
jump L2
L1:
mark L3
mkvec 0
mkclos L4
jump L5
L4:
loadc 4
mkbasic
update
L5:
pushglob 0
eval
apply
L3:
update
L2:
rewrite 2
mkvec 0
mkclos L6
jump L7
L6:
mkvec 0
mkfunval L8
jump L9
L8:
targ 1
pushloc 0
eval
getbasic
loadc 2
add
mkbasic
return 1
L9:
update
L7:
rewrite 1
pushloc 1
eval
slide 2
halt
