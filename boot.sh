#!/bin/bash

jar_name="Venus-*.*-SNAPSHOT.jar"
case "$1" in

  start)
    mvn clean
    mvn install
    cd ./target
    nohup java -jar $(jar_name) &
    tail -f nohup.out
    ;;

  stop)
    cur_pid=grep $(jar_name)|grep -v grep|awk '{print $2}'
    kill -9 $(cur_pid)
    ehco "$(jar_name) stop success"
    ;;

  restart)
    $0 stop
    sleep 3
    $0 start
    ;;

  esac





