#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR/../
ant -f build.xml -Ddeploy.opr=android -Ddeploy.dir=/gamejelly/repo-server/webroot_gms_android -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_android
ant -f build.xml -Ddeploy.opr=android -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_android cp_tools_deploy
