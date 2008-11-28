alloc 5
mkvec 0
mkclos L1
jump L2
L1:
mkvec 0
mkfunval L3
jump L4
L3:
targ 3
mark L5
pushloc 4
pushloc 6
mkvec 2
mkclos L6
jump L7
L6:
mark L8
pushglob 1
mkvec 1
mkclos L9
jump L10
L9:
pushglob 0
eval
update
L10:
pushglob 0
eval
apply
L8:
update
L7:
pushloc 4
eval
apply
L5:
return 3
L4:
update
L2:
rewrite 5
pushloc 4
mkvec 1
mkclos L11
jump L12
L11:
pushglob 0
mkvec 1
mkfunval L13
jump L14
L13:
targ 1
mark L15
pushloc 3
mkvec 1
mkclos L16
jump L17
L16:
pushglob 0
eval
update
L17:
pushloc 4
mkvec 1
mkclos L18
jump L19
L18:
pushglob 0
eval
update
L19:
pushglob 0
eval
apply
L15:
return 1
L14:
update
L12:
rewrite 4
pushloc 3
mkvec 1
mkclos L20
jump L21
L20:
pushglob 0
mkvec 1
mkfunval L22
jump L23
L22:
targ 2
pushloc 0
pushglob 0
mkvec 2
mkclos L24
jump L25
L24:
mark L26
pushglob 0
mkvec 1
mkclos L27
jump L28
L27:
pushglob 0
eval
update
L28:
pushglob 1
eval
apply
L26:
update
L25:
pushloc 0
pushglob 0
mkvec 2
mkclos L29
jump L30
L29:
mark L31
pushglob 0
mkvec 1
mkclos L32
jump L33
L32:
pushglob 0
eval
update
L33:
pushglob 1
eval
apply
L31:
update
L30:
mark L34
pushloc 3
pushloc 7
mkvec 2
mkclos L35
jump L36
L35:
mark L37
pushglob 1
mkvec 1
mkclos L38
jump L39
L38:
pushglob 0
eval
update
L39:
pushglob 0
eval
apply
L37:
update
L36:
pushloc 4
eval
apply
L34:
slide 2
return 2
L23:
update
L21:
rewrite 3
mkvec 0
mkclos L40
jump L41
L40:
mkvec 0
mkfunval L42
jump L43
L42:
targ 1
pushloc 0
eval
getbasic
loadc 1
add
mkbasic
return 1
L43:
update
L41:
rewrite 2
pushloc 2
pushloc 2
mkvec 2
mkclos L44
jump L45
L44:
mark L46
mkvec 0
mkclos L47
jump L48
L47:
loadc 0
mkbasic
update
L48:
pushglob 1
mkvec 1
mkclos L49
jump L50
L49:
pushglob 0
eval
update
L50:
pushglob 0
eval
apply
L46:
update
L45:
rewrite 1
pushloc 0
eval
slide 5
halt
