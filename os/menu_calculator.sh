#!/bin/bash

while true; do
    echo "
1) Add
2) Sub
3) Mul
4) Div
5) Exit
    "
    read -p "Enter your choice (eq: 1): " USER_INPUT

    if [ $USER_INPUT -eq 5 ]; then
        echo "Goodbye!"
        break
    elif [ $USER_INPUT -gt 5 ]; then
        echo "Invalid input, please try again!"
        continue
    fi

    read -p "Enter a number: " num1
    read -p "Enter another number: " num2

    case $USER_INPUT in
        1) echo "$num1 + $num2 = $(($num1 + $num2))" ;;
        2) echo "$num1 - $num2 = $(($num1 - $num2))" ;;
        3) echo "$num1 * $num2 = $(($num1 * $num2))" ;;
        4) echo "$num1 / $num2 = $(($num1 / $num2))" ;;
        *) echo "Invalid input, please try again!"
    esac
done