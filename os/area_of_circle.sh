#!/bin/bash

read -p "Enter the radius of the circle: " r;

AREA=$(echo "3.14 * $r * $r" | bc)

echo "Area of the cirlce is: $AREA"

