alloc 1
mkvec 0
mkclos L1
jump L2
L1:
 mkvec 0
 mkfunval L3
 jump L4
 L3:
 targ 0
 loadc 2
 mkbasic
 return 0
 L4:
update
L2:
rewrite 1
pushloc 0
eval
slide 1
apply0
halt