#!/bin/bash

read -p "Enter a number: " num

if [ $(($num % 2)) -eq 0 ]; then
    echo "The given number $num is even"
else
    echo "The given number is odd"
fi