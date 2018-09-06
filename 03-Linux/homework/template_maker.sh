#!/bin/bash

#First param of the script is for the file with the values of the params
#Second param is for the text file

paramsNamesString= $(cat $1 | sed "s/\([a-zA-Z0-9_-]*\)=[a-zA-Z0-9_-]*/\1/")

paramsValuesString=$(cat $1 | sed "s/[a-zA-Z0-9_-]*=\([a-zA-Z0-9_-]*\)/\1/")

paramsNamesArray=($paramsNamesString)
paramsValuesArray=($paramsValuesArray)

I=0

while [ $I -lt 9 ]
do
	touch tmp.txt
	echo $(cat $2 | sed "s/@${paramsNamesArray[$I]}@/${paramsValuesArray[$I]}/") >> tmp.txt
	cat tmp.txt > $2
	rm tmp.txt
	I=$((I + 1))
done

cat $2
