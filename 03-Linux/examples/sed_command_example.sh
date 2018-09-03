#!/bin/bash

cat /etc/passwd | sed "s/^[a-zA-Z0-9_-]*:/root:/" > /tmp/passwd

cat /etc/passwd | sed 's/^\([a-zA-Z0-9_-]*\):\(.*\)$/\2:\1/'
