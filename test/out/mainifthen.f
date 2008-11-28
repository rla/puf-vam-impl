alloc 1
mkvec 0
mkclos L1
jump L2
L1:
loadc 0
jumpz L3
loadc 5
mkbasic
jump L4
L3:
loadc 2
mkbasic
L4:
update
L2:
rewrite 1
pushloc 0
eval
slide 1
halt
