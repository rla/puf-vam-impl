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
loadc 0
mkbasic
jump L6
L5:
pushloc 0
eval
getbasic
loadc 1
eq
jumpz L7
loadc 1
mkbasic
jump L8
L7:
mark L9
pushloc 3
mkvec 1
mkclos L10
jump L11
L10:
pushglob 0
eval
getbasic
loadc 1
sub
mkbasic
update
L11:
pushglob 0
eval
apply
L9:
getbasic
mark L12
pushloc 4
mkvec 1
mkclos L13
jump L14
L13:
pushglob 0
eval
getbasic
loadc 2
sub
mkbasic
update
L14:
pushglob 0
eval
apply
L12:
getbasic
add
mkbasic
L8:
L6:
return 1
L4:
update
L2:
rewrite 2
pushloc 1
mkvec 1
mkclos L15
jump L16
L15:
mark L17
mkvec 0
mkclos L18
jump L19
L18:
loadc 4
mkbasic
update
L19:
pushglob 0
eval
apply
L17:
update
L16:
rewrite 1
pushloc 0
eval
slide 2
halt
