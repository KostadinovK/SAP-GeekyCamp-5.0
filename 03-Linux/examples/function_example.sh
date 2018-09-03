#!/bin/bash

functionName(){ #$1 is a parameter of a function
	echo "$1 and some more stuff."

}

VAR1=$(functionName blah)
echo "$VAR1 and more stuff."
