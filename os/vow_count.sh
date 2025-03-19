#!/bin/bash

read -p "Enter a string: " str

vowels=0
consonants=0
numbers=0

for ((i=0; i<=${#str}; i++)); do
    char=${str:$i:1}
    
    if [[ $char =~ [aeiou] ]]; then
        ((vowels++))
    elif [[ $char =~ [bcdfghjklmnpqrstvwxyz] ]]; then
        ((consonants++))
    elif [[ $char =~ [0-9] ]]; then
        ((numbers++))
    fi
done

echo "
Vowels: $vowels
Consonants: $consonants
Numbers: $numbers
"