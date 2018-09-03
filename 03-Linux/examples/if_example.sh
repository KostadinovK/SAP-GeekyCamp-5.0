#!/bin/bash

if touch test
then
	echo "we touched it."
else
	echo "Can\'t touch it."
fi

if [ $1 = "alabala" ]
then
	echo "Match with alabala"
else
	echo "Dont match with alabala"
fi


