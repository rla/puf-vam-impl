alloc 8
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
rewrite 8
mkvec 0
mkclos L5
jump L6
L5:
mkvec 0
mkfunval L7
jump L8
L7:
targ 2
pushloc 1
eval
return 2
L8:
update
L6:
rewrite 7
mkvec 0
mkclos L9
jump L10
L9:
mkvec 0
mkfunval L11
jump L12
L11:
targ 2
pushloc 1
pushloc 1
mkvec 2
mkfunval L13
jump L14
L13:
targ 2
mark L15
pushglob 0
mkvec 1
mkclos L16
jump L17
L16:
pushglob 0
eval
update
L17:
pushglob 1
mkvec 1
mkclos L18
jump L19
L18:
pushglob 0
eval
update
L19:
pushloc 5
eval
apply
L15:
return 2
L14:
return 2
L12:
update
L10:
rewrite 6
pushloc 2
pushloc 8
mkvec 2
mkclos L20
jump L21
L20:
pushglob 0
pushglob 1
mkvec 2
mkfunval L22
jump L23
L22:
targ 1
mark L24
pushglob 0
mkvec 1
mkclos L25
jump L26
L25:
pushglob 0
eval
update
L26:
pushglob 1
mkvec 1
mkclos L27
jump L28
L27:
pushglob 0
eval
update
L28:
pushloc 5
eval
apply
L24:
return 1
L23:
update
L21:
rewrite 5
pushloc 6
pushloc 3
mkvec 2
mkclos L29
jump L30
L29:
pushglob 0
pushglob 1
mkvec 2
mkfunval L31
jump L32
L31:
targ 1
mark L33
pushglob 1
mkvec 1
mkclos L34
jump L35
L34:
pushglob 0
eval
update
L35:
pushglob 0
mkvec 1
mkclos L36
jump L37
L36:
pushglob 0
eval
update
L37:
pushloc 5
eval
apply
L33:
return 1
L32:
update
L30:
rewrite 4
pushloc 2
mkvec 1
mkclos L38
jump L39
L38:
pushglob 0
eval
update
L39:
rewrite 3
pushloc 5
mkvec 1
mkclos L40
jump L41
L40:
pushglob 0
mkvec 1
mkfunval L42
jump L43
L42:
targ 1
alloc 1
pushloc 0
pushloc 2
pushglob 0
mkvec 3
mkclos L44
jump L45
L44:
mark L46
pushglob 0
mkvec 1
mkclos L47
jump L48
L47:
pushglob 0
eval
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
pushglob 2
eval
apply
L46:
update
L45:
rewrite 1
pushloc 0
eval
slide 1
return 1
L43:
update
L41:
rewrite 2
pushloc 1
pushloc 4
pushloc 6
mkvec 3
mkclos L51
jump L52
L51:
mark L53
pushglob 0
pushglob 1
mkvec 2
mkclos L54
jump L55
L54:
mark L56
pushglob 0
pushglob 1
mkvec 2
mkclos L57
jump L58
L57:
mark L59
pushglob 0
mkvec 1
mkclos L60
jump L61
L60:
mark L62
mkvec 0
mkclos L63
jump L64
L63:
loadc 4
mkbasic
update
L64:
pushglob 0
eval
apply
L62:
update
L61:
pushglob 1
eval
apply
L59:
update
L58:
pushglob 1
eval
apply
L56:
update
L55:
pushglob 2
eval
apply
L53:
update
L52:
rewrite 1
pushloc 0
eval
slide 8
halt
