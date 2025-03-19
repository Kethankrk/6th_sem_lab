#!/bin/bash

read -p "Enter a number: " NUM

NUM_CPY=$NUM
SUM=0
while [ $NUM_CPY -gt 0 ]; do
    DIGIT=$(($NUM_CPY % 10))
    SUM=$(($SUM + $DIGIT))
    NUM_CPY=$(($NUM_CPY / 10))
done

echo "Sum of digits in $NUM is $SUM"