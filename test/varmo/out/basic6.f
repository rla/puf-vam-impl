alloc 5
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
rewrite 5
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
pushloc 4
eval
apply
L9:
return 3
L8:
update
L6:
rewrite 4
pushloc 3
mkvec 1
mkclos L15
jump L16
L15:
pushglob 0
mkvec 1
mkfunval L17
jump L18
L17:
targ 1
mark L19
pushloc 3
mkvec 1
mkclos L20
jump L21
L20:
pushglob 0
eval
update
L21:
pushloc 4
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
return 1
L18:
update
L16:
rewrite 3
pushloc 2
mkvec 1
mkclos L24
jump L25
L24:
pushglob 0
mkvec 1
mkfunval L26
jump L27
L26:
targ 2
pushloc 0
pushglob 0
mkvec 2
mkclos L28
jump L29
L28:
mark L30
pushglob 0
mkvec 1
mkclos L31
jump L32
L31:
pushglob 0
eval
update
L32:
pushglob 1
eval
apply
L30:
update
L29:
pushloc 0
pushglob 0
mkvec 2
mkclos L33
jump L34
L33:
mark L35
pushglob 0
mkvec 1
mkclos L36
jump L37
L36:
pushglob 0
eval
update
L37:
pushglob 1
eval
apply
L35:
update
L34:
mark L38
pushloc 3
pushloc 7
mkvec 2
mkclos L39
jump L40
L39:
mark L41
pushglob 1
mkvec 1
mkclos L42
jump L43
L42:
pushglob 0
eval
update
L43:
pushglob 0
eval
apply
L41:
update
L40:
pushloc 4
eval
apply
L38:
slide 2
return 2
L27:
update
L25:
rewrite 2
pushloc 1
pushloc 5
mkvec 2
mkclos L44
jump L45
L44:
mark L46
mkvec 0
mkclos L47
jump L48
L47:
loadc 4
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
