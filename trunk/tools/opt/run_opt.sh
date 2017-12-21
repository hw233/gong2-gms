#!/bin/bash

PARAM1="$2"

cd /gamejelly/deploy_gong_game_gms/tools_gms

day () {
      python main.py $PARAM1
};


case "$1" in
    day)
        day;
        ;;
    *)
        echo "Usage $0 day..."
        exit 1;
        ;;

esac;
