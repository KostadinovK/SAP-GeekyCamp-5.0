#!/bin/bash

FILES="file1 file2 file3"

touch file1
touch file3

for F in $FILES
do
	if [ -e $F  ]
	then
		echo "$F exists in this directory."
	else
		echo "$F doesn\'t exist in this directory."
	fi	#check if the file exist
done
