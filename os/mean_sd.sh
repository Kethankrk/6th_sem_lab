#!/bin/bash

calculate_mean() {
    mean=$(echo "($1 + $2 + $3 ) / 3" | bc -l)
    echo $mean
}

calculate_sd() {
    mean=$1
    sd=$(echo "sqrt((($2 - $mean)^2 + ($3 - $mean)^2 + ($4 - $mean)^2) / 3)" | bc -l)
    echo $sd
}

read -p "Enter three numbers: " num1 num2 num3

mean=$(calculate_mean $num1 $num2 $num3)
echo "Mean: $mean"

sd=$(calculate_sd $mean $num1 $num2 $num3)
echo "Standard Deviation: $sd"