#!/bin/bash

jar_name="Venus-*.*-SNAPSHOT.jar"
case "$1" in

  start)
    mvn clean
    mvn install
    nohup java -jar ./target/Venus-1.0-SNAPSHOT.jar >> /var/log/jenkins/venus.out &
    tail -f /var/log/jenkins/venus.out
    ;;

  stop)
    cur_pid=`ps -ef|grep Venus-1.0-SNAPSHOT.jar|grep -v grep|awk '{print $2}'`
    kill -9 ${cur_pid}
    echo "Venus stop success"
    ;;

  restart)
    $0 stop
    sleep 3
    $0 start
    ;;

  esac





