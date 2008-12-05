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
targ 2
pushloc 0
eval
getbasic
pushloc 2
eval
getbasic
eq
jumpz L5
pushloc 0
eval
jump L6
L5:
pushloc 0
eval
getbasic
pushloc 2
eval
getbasic
le
jumpz L7
mark L9
pushloc 3
mkvec 1
mkclos L10
jump L11
L10:
pushglob 0
eval
update
L11:
pushloc 5
mkvec 1
mkclos L12
jump L13
L12:
pushglob 0
eval
update
L13:
pushglob 0
eval
apply
L9:
jump L8
L7:
mark L14
pushloc 4
pushloc 4
mkvec 2
mkclos L15
jump L16
L15:
pushglob 1
eval
getbasic
pushglob 0
eval
getbasic
sub
mkbasic
update
L16:
pushloc 5
mkvec 1
mkclos L17
jump L18
L17:
pushglob 0
eval
update
L18:
pushglob 0
eval
apply
L14:
L8:
L6:
return 2
L4:
update
L2:
rewrite 2
pushloc 1
mkvec 1
mkclos L19
jump L20
L19:
mark L21
mkvec 0
mkclos L22
jump L23
L22:
loadc 10
mkbasic
update
L23:
mkvec 0
mkclos L24
jump L25
L24:
loadc 6
mkbasic
update
L25:
pushglob 0
eval
apply
L21:
update
L20:
rewrite 1
pushloc 0
eval
slide 2
halt
