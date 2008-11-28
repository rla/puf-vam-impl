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
loadc 2
mkbasic
update
L5:
mkvec 0
mkclos L6
jump L7
L6:
loadc 4
mkbasic
update
L7:
pushglob 0
eval
apply
L3:
update
L2:
rewrite 2
mkvec 0
mkclos L8
jump L9
L8:
mkvec 0
mkfunval L10
jump L11
L10:
targ 2
pushloc 0
eval
getbasic
pushloc 2
eval
getbasic
add
mkbasic
return 2
L11:
update
L9:
rewrite 1
pushloc 1
eval
slide 2
halt
