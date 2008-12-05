alloc 5
mkvec 0
mkclos L1
jump L2
L1:
mkvec 0
mkfunval L3
jump L4
L3:
targ 2
pushloc 1
pushloc 1
mkvec 2
mkfunval L5
jump L6
L5:
targ 2
mark L7
pushglob 0
mkvec 1
mkclos L8
jump L9
L8:
pushglob 0
eval
update
L9:
pushglob 1
mkvec 1
mkclos L10
jump L11
L10:
pushglob 0
eval
update
L11:
pushloc 5
eval
apply
L7:
return 2
L6:
return 2
L4:
update
L2:
rewrite 5
mkvec 0
mkclos L12
jump L13
L12:
mkvec 0
mkfunval L14
jump L15
L14:
targ 2
pushloc 1
eval
return 2
L15:
update
L13:
rewrite 4
pushloc 1
mkvec 1
mkclos L16
jump L17
L16:
pushglob 0
mkvec 1
mkfunval L18
jump L19
L18:
targ 1
mark L20
mkvec 0
mkclos L21
jump L22
L21:
loadc 0
mkbasic
update
L22:
pushglob 0
mkvec 1
mkclos L23
jump L24
L23:
pushglob 0
eval
update
L24:
pushloc 5
eval
apply
L20:
return 1
L19:
update
L17:
rewrite 3
pushloc 2
mkvec 1
mkclos L25
jump L26
L25:
pushglob 0
mkvec 1
mkfunval L27
jump L28
L27:
targ 2
loadc 1
mark L29
pushloc 5
mkvec 1
mkclos L30
jump L31
L30:
pushglob 0
eval
update
L31:
pushglob 0
eval
apply
L29:
getbasic
add
mkbasic
return 2
L28:
update
L26:
rewrite 2
pushloc 2
pushloc 5
pushloc 5
mkvec 3
mkclos L32
jump L33
L32:
mark L34
pushglob 2
pushglob 1
mkvec 2
mkclos L35
jump L36
L35:
mark L37
pushglob 0
pushglob 1
mkvec 2
mkclos L38
jump L39
L38:
mark L40
pushglob 0
pushglob 1
mkvec 2
mkclos L41
jump L42
L41:
mark L43
pushglob 0
mkvec 1
mkclos L44
jump L45
L44:
pushglob 0
eval
update
L45:
mkvec 0
mkclos L46
jump L47
L46:
loadc 4
mkbasic
update
L47:
pushglob 1
eval
apply
L43:
update
L42:
mkvec 0
mkclos L48
jump L49
L48:
loadc 3
mkbasic
update
L49:
pushglob 1
eval
apply
L40:
update
L39:
mkvec 0
mkclos L50
jump L51
L50:
loadc 2
mkbasic
update
L51:
pushglob 1
eval
apply
L37:
update
L36:
pushglob 0
eval
apply
L34:
update
L33:
rewrite 1
pushloc 0
eval
slide 5
halt
