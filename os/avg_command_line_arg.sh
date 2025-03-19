#!/bin/bash

if [ $# -eq 0 ]; then
    echo "Usage: $0 num1 num2 num3..."
fi

sum=0

for n in $@; do
    ((sum+=$n))
done

echo "Average: $(( $sum / $# ))"