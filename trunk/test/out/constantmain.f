alloc 3
pushloc 1
mkvec 1
mkclos L1
jump L2
L1:
pushglob 0
eval
update
L2:
rewrite 3
pushloc 0
mkvec 1
mkclos L3
jump L4
L3:
pushglob 0
eval
update
L4:
rewrite 2
mkvec 0
mkclos L5
jump L6
L5:
loadc 2
loadc 3
loadc 5
mul
add
mkbasic
update
L6:
rewrite 1
pushloc 2
eval
slide 3
halt