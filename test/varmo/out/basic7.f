alloc 1
mkvec 0
mkclos L1
jump L2
L1:
loadc 2
loadc 3
mul
loadc 4
loadc 5
sub
add
mkbasic
update
L2:
rewrite 1
pushloc 0
eval
slide 1
halt
