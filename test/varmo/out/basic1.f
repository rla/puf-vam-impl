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
mark L7
mkvec 0
mkclos L8
jump L9
L8:
loadc 3
mkbasic
update
L9:
pushglob 0
eval
apply
L7:
update
L6:
rewrite 1
pushloc 0
eval
slide 2
halt
