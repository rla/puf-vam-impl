alloc 6
pushloc 2
pushloc 4
mkvec 2
mkclos L1
jump L2
L1:
mark L3
pushglob 1
mkvec 1
mkclos L4
jump L5
L4:
pushglob 0
eval
update
L5:
pushglob 1
mkvec 1
mkclos L6
jump L7
L6:
pushglob 0
eval
update
L7:
pushglob 0
eval
apply
L3:
update
L2:
rewrite 6
pushloc 5
pushloc 1
mkvec 2
mkclos L8
jump L9
L8:
mark L10
mkvec 0
mkclos L11
jump L12
L11:
loadc 3
mkbasic
update
L12:
pushglob 0
mkvec 1
mkclos L13
jump L14
L13:
pushglob 0
eval
update
L14:
pushglob 1
mkvec 1
mkclos L15
jump L16
L15:
pushglob 0
eval
update
L16:
pushglob 1
mkvec 1
mkclos L17
jump L18
L17:
pushglob 0
eval
update
L18:
pushglob 1
eval
apply
L10:
update
L9:
rewrite 5
mkvec 0
mkclos L19
jump L20
L19:
mkvec 0
mkfunval L21
jump L22
L21:
targ 2
pushloc 0
eval
return 2
L22:
update
L20:
rewrite 4
mkvec 0
mkclos L23
jump L24
L23:
mkvec 0
mkfunval L25
jump L26
L25:
targ 3
mark L27
pushloc 4
pushloc 6
mkvec 2
mkclos L28
jump L29
L28:
mark L30
pushglob 1
mkvec 1
mkclos L31
jump L32
L31:
pushglob 0
eval
update
L32:
pushglob 0
eval
apply
L30:
update
L29:
pushloc 6
mkvec 1
mkclos L33
jump L34
L33:
pushglob 0
eval
update
L34:
pushloc 5
eval
apply
L27:
return 3
L26:
update
L24:
rewrite 3
mkvec 0
mkclos L35
jump L36
L35:
mkvec 0
mkfunval L37
jump L38
L37:
targ 3
mark L39
pushloc 4
pushloc 6
mkvec 2
mkclos L40
jump L41
L40:
mark L42
pushglob 1
mkvec 1
mkclos L43
jump L44
L43:
pushglob 0
eval
update
L44:
pushglob 0
eval
apply
L42:
update
L41:
pushloc 4
eval
apply
L39:
return 3
L38:
update
L36:
rewrite 2
pushloc 1
mkvec 1
mkclos L45
jump L46
L45:
pushglob 0
mkvec 1
mkfunval L47
jump L48
L47:
targ 1
mark L49
pushloc 3
mkvec 1
mkclos L50
jump L51
L50:
pushglob 0
eval
update
L51:
pushloc 4
mkvec 1
mkclos L52
jump L53
L52:
pushglob 0
eval
update
L53:
pushglob 0
eval
apply
L49:
return 1
L48:
update
L46:
rewrite 1
pushloc 4
eval
slide 6
halt
