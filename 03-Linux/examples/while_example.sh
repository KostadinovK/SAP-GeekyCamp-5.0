#!/bin/bash

I=1

while [ $I -le 100  ]
do
	echo $I
	I=$(expr $I + 1) #expr is used to represent a string like an int to add 1 to it
done


