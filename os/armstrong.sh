#!/bin/bash

read -p "Enter a number: " NUM

TEMP=$NUM
SUM=0
N=${#NUM}

while [ $TEMP -gt 0 ]; do
    DIGIT=$(($TEMP % 10))
    SUM=$(($SUM + $(echo "$DIGIT^$N" | bc)))
    ((TEMP/=10))
done

if [ $SUM -eq $NUM ]; then
    echo "$NUM is an armstrong number"
else
    echo "$NUM is not an armstrong number"
fi