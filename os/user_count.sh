#!/bin/bash

echo "Current date and time: $(date)"
echo "Numer of users logged in: $(who | wc -l)"
echo "Terminal: $TERM"
echo "Current login date and time: $(who | awk '{print $3, $4}')"