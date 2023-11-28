#!/bin/sh
NAME=syt-app-1.0
ID=`ps -ef | grep "$NAME" | grep -v "$0" | grep -v "grep" | awk '{print $2}'`
echo $ID 
for id in $ID
do
kill -9 $id
echo "killed $id"
done 

BUILD_ID=syt-app
nohup /www/server/jdk/jdk-11.0.15/bin/java -Xms256m -Xmx512m -jar ./syt-app-1.0.jar > ./logs/catalog.out 2>&1 &
echo 'Start success!'