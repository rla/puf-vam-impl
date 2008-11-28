alloc 4
mkvec 0
mkclos L1
jump L2
L1:
mkvec 0
mkfunval L3
jump L4
L3:
targ 2
pushloc 0
eval
return 2
L4:
update
L2:
rewrite 4
mkvec 0
mkclos L5
jump L6
L5:
mkvec 0
mkfunval L7
jump L8
L7:
targ 3
mark L9
pushloc 4
pushloc 6
mkvec 2
mkclos L10
jump L11
L10:
mark L12
pushglob 1
mkvec 1
mkclos L13
jump L14
L13:
pushglob 0
eval
update
L14:
pushglob 0
eval
apply
L12:
update
L11:
pushloc 6
mkvec 1
mkclos L15
jump L16
L15:
pushglob 0
eval
update
L16:
pushloc 5
eval
apply
L9:
return 3
L8:
update
L6:
rewrite 3
pushloc 2
pushloc 4
mkvec 2
mkclos L17
jump L18
L17:
mark L19
pushglob 1
mkvec 1
mkclos L20
jump L21
L20:
pushglob 0
eval
update
L21:
pushglob 1
mkvec 1
mkclos L22
jump L23
L22:
pushglob 0
eval
update
L23:
pushglob 0
eval
apply
L19:
update
L18:
rewrite 2
pushloc 1
mkvec 1
mkclos L24
jump L25
L24:
mark L26
mkvec 0
mkclos L27
jump L28
L27:
loadc 3
mkbasic
update
L28:
pushglob 0
eval
apply
L26:
update
L25:
rewrite 1
pushloc 0
eval
slide 4
halt
