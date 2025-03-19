#!/bin/bash

read -p "Enter a string: " STR

REV_STR=$(echo "$STR" | rev)

echo "Reverese: $REV_STR"

if [ $STR == $REV_STR ]; then
    echo "Given string is a palindrom"
else
    echo "Given string is not a palindrom"
fi