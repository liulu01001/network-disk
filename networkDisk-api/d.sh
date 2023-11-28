#!/bin/sh
NAME=syt-app-1.0
echo $NAME
ID=`ps -ef | grep "$NAME" | grep -v "$0" | grep -v "grep" | awk '{print $2}'`
echo $ID 
for id in $ID
do
kill -9 $id
echo "killed $id"
done