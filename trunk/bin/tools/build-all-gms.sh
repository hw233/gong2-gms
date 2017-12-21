#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR/../


ant -f build.xml -Ddeploy.opr=test -Ddeploy.dir=/gamejelly/deploy_gong_game_gms -Dopt.deploy.dir=/gamejelly/tools_gms_test
ant -f build.xml -Ddeploy.opr=test -Dopt.deploy.dir=/gamejelly/tools_gms_test cp_tools_deploy



ant -f build.xml -Ddeploy.opr=hd -Ddeploy.dir=/gamejelly/repo-server/webroot_gms_hd -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_hd
ant -f build.xml -Ddeploy.opr=hd -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_hd cp_tools_deploy


ant -f build.xml -Ddeploy.opr=iosyy -Ddeploy.dir=/gamejelly/repo-server/webroot_gms_iosyy -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_iosyy
ant -f build.xml -Ddeploy.opr=iosyy -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_iosyy cp_tools_deploy

echo "build-all-gms end"