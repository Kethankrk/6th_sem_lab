#!/bin/bash

hr=$(date +%H)

if [ $hr -ge 5 ] && [ $hr -lt 12 ]; then
    echo "Good morning!"
elif [ $hr -ge 12 ] && [ $hr -lt 17 ]; then
    echo "Good afternoon"
else
    echo "Good evening"
fi