alloc 8
pushloc 7
pushloc 4
mkvec 2
mkclos L1
jump L2
L1:
pushglob 0
pushglob 1
mkvec 2
mkfunval L3
jump L4
L3:
targ 1
mark L5
pushglob 0
pushloc 4
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
mkvec 1
mkclos L11
jump L12
L11:
pushglob 0
eval
update
L12:
pushglob 1
eval
apply
L5:
return 1
L4:
update
L2:
rewrite 8
pushloc 7
pushloc 2
pushloc 4
mkvec 3
mkclos L13
jump L14
L13:
mark L15
pushglob 0
pushglob 1
mkvec 2
mkclos L16
jump L17
L16:
mark L18
pushglob 0
mkvec 1
mkclos L19
jump L20
L19:
mark L21
mkvec 0
mkclos L22
jump L23
L22:
loadc 4
mkbasic
update
L23:
pushglob 0
eval
apply
L21:
update
L20:
pushglob 1
eval
apply
L18:
update
L17:
pushglob 2
eval
apply
L15:
update
L14:
rewrite 7
mkvec 0
mkclos L24
jump L25
L24:
mkvec 0
mkfunval L26
jump L27
L26:
targ 2
pushloc 0
eval
return 2
L27:
update
L25:
rewrite 6
mkvec 0
mkclos L28
jump L29
L28:
mkvec 0
mkfunval L30
jump L31
L30:
targ 2
pushloc 1
eval
return 2
L31:
update
L29:
rewrite 5
mkvec 0
mkclos L32
jump L33
L32:
mkvec 0
mkfunval L34
jump L35
L34:
targ 2
pushloc 1
pushloc 1
mkvec 2
mkfunval L36
jump L37
L36:
targ 2
mark L38
pushglob 0
mkvec 1
mkclos L39
jump L40
L39:
pushglob 0
eval
update
L40:
pushglob 1
mkvec 1
mkclos L41
jump L42
L41:
pushglob 0
eval
update
L42:
pushloc 5
eval
apply
L38:
return 2
L37:
return 2
L35:
update
L33:
rewrite 4
pushloc 0
pushloc 6
mkvec 2
mkclos L43
jump L44
L43:
pushglob 0
pushglob 1
mkvec 2
mkfunval L45
jump L46
L45:
targ 1
mark L47
pushglob 0
mkvec 1
mkclos L48
jump L49
L48:
pushglob 0
eval
update
L49:
pushglob 1
mkvec 1
mkclos L50
jump L51
L50:
pushglob 0
eval
update
L51:
pushloc 5
eval
apply
L47:
return 1
L46:
update
L44:
rewrite 3
pushloc 4
pushloc 1
mkvec 2
mkclos L52
jump L53
L52:
pushglob 0
pushglob 1
mkvec 2
mkfunval L54
jump L55
L54:
targ 1
mark L56
pushglob 1
mkvec 1
mkclos L57
jump L58
L57:
pushglob 0
eval
update
L58:
pushglob 0
mkvec 1
mkclos L59
jump L60
L59:
pushglob 0
eval
update
L60:
pushloc 5
eval
apply
L56:
return 1
L55:
update
L53:
rewrite 2
pushloc 0
mkvec 1
mkclos L61
jump L62
L61:
pushglob 0
eval
update
L62:
rewrite 1
pushloc 6
eval
slide 8
halt
