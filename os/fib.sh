#!/bin/bash

fibonnaci() {
    if [ $1 -le 1 ]; then
        echo $1
    else
        echo $(( $(fibonnaci $(($1 - 1))) + $(fibonnaci $(($1 - 2))) ))
    fi
}


read -p "How many numbers do you want of Fibonnaci series? " NUM

for i in $(seq 1 $NUM); do
    echo -n "$(fibonnaci $i) "
done
echo ""