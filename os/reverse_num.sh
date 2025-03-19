#!/bin/bash

read -p "Enter a number: " NUM

TEMP=$NUM
REV=0

while [ $TEMP -gt 0 ]; do
    DIGIT=$(($TEMP % 10))
    REV=$((REV * 10 + $DIGIT))
    ((TEMP/=10))
done

echo "Reverse of $NUM is $REV"