#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR/../
ant -f build.xml -Ddeploy.opr=test -Ddeploy.dir=/gamejelly/deploy_gong_game_gms -Dopt.deploy.dir=/gamejelly/tools_gms_test
ant -f build.xml -Ddeploy.opr=test -Dopt.deploy.dir=/gamejelly/tools_gms_test cp_tools_deploy
