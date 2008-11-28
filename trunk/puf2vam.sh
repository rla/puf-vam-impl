#!/bin/sh

P2V_HOME=$(dirname $(readlink -f $0))

java -cp $P2V_HOME/puf2vam.jar:$P2V_HOME/lib/antlr-runtime.jar:$P2V_HOME/lib/commons-cli.jar:$P2V_HOME/lib/commons-lang.jar:$P2V_HOME/lib/commons-io.jar tr.fn.Compile $*
