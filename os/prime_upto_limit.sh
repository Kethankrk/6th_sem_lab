#!/bin/bash

read -p "Enter a number: " NUM 

for i in $(seq 1 $(($NUM - 1))); do
    FACT=0

    for j in $(seq 1 $i); do
        if [ $(($i % $j)) -eq 0 ]; then
            FACT=$(($FACT + 1))
        fi
    done
    if [ $FACT -eq 2 ]; then
        echo "$i"
    fi
done