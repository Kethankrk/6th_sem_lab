#!/bin/bash

read -p "Enter a file name: " FILE

w=$(cat $FILE | wc -w)
c=$(cat $FILE | wc -c)
l=$(cat $FILE | wc -l)

echo "
Total lines: $l
Total words: $w
Total chars: $c"