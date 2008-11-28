alloc 2
mkvec 0
mkclos L1
jump L2
L1:
mkvec 0
mkfunval L3
jump L4
L3:
targ 1
pushloc 0
eval
return 1
L4:
update
L2:
rewrite 2
pushloc 1
mkvec 1
mkclos L5
jump L6
L5:
pushglob 0
mkvec 1
mkclos L7
jump L8
L7:
mark L9
pushglob 0
mkvec 1
mkclos L10
jump L11
L10:
pushglob 0
eval
update
L11:
pushglob 0
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
update
L8:
mark L14
mkvec 0
mkclos L15
jump L16
L15:
loadc 3
mkbasic
update
L16:
pushloc 4
mkvec 1
mkclos L17
jump L18
L17:
pushglob 0
eval
update
L18:
pushloc 5
eval
apply
L14:
slide 1
update
L6:
rewrite 1
pushloc 0
eval
slide 2
halt
