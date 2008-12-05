alloc 2
pushloc 1
mkvec 1
mkclos L1
jump L2
L1:
pushglob 0
mkvec 1
mkfunval L3
jump L4
L3:
targ 1
pushloc 0
eval
getbasic
loadc 0
eq
jumpz L5
loadc 1
mkbasic
jump L6
L5:
pushloc 0
eval
getbasic
mark L7
pushloc 4
mkvec 1
mkclos L8
jump L9
L8:
pushglob 0
eval
getbasic
loadc 1
sub
mkbasic
update
L9:
pushglob 0
eval
apply
L7:
getbasic
mul
mkbasic
L6:
return 1
L4:
update
L2:
rewrite 2
pushloc 1
mkvec 1
mkclos L10
jump L11
L10:
mark L12
mkvec 0
mkclos L13
jump L14
L13:
loadc 5
mkbasic
update
L14:
pushglob 0
eval
apply
L12:
update
L11:
rewrite 1
pushloc 0
eval
slide 2
halt
