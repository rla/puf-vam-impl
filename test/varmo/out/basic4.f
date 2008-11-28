alloc 4
pushloc 0
pushloc 3
mkvec 2
mkclos L1
jump L2
L1:
mark L3
mkvec 0
mkclos L4
jump L5
L4:
loadc 3
mkbasic
update
L5:
pushglob 1
mkvec 1
mkclos L6
jump L7
L6:
mark L8
pushglob 0
mkvec 1
mkclos L9
jump L10
L9:
pushglob 0
eval
update
L10:
pushglob 0
mkvec 1
mkclos L11
jump L12
L11:
pushglob 0
eval
update
L12:
pushglob 0
eval
apply
L8:
update
L7:
pushglob 0
eval
apply
L3:
update
L2:
rewrite 4
mkvec 0
mkclos L13
jump L14
L13:
mkvec 0
mkfunval L15
jump L16
L15:
targ 1
pushloc 0
eval
return 1
L16:
update
L14:
rewrite 3
mkvec 0
mkclos L17
jump L18
L17:
mkvec 0
mkfunval L19
jump L20
L19:
targ 3
mark L21
pushloc 4
pushloc 6
mkvec 2
mkclos L22
jump L23
L22:
mark L24
pushglob 1
mkvec 1
mkclos L25
jump L26
L25:
pushglob 0
eval
update
L26:
pushglob 0
eval
apply
L24:
update
L23:
pushloc 4
eval
apply
L21:
return 3
L20:
update
L18:
rewrite 2
pushloc 1
mkvec 1
mkclos L27
jump L28
L27:
pushglob 0
mkvec 1
mkfunval L29
jump L30
L29:
targ 1
mark L31
pushloc 3
mkvec 1
mkclos L32
jump L33
L32:
pushglob 0
eval
update
L33:
pushloc 4
mkvec 1
mkclos L34
jump L35
L34:
pushglob 0
eval
update
L35:
pushglob 0
eval
apply
L31:
return 1
L30:
update
L28:
rewrite 1
pushloc 3
eval
slide 4
halt
