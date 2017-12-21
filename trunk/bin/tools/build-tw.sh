#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR/../
ant -f build.xml -Ddeploy.opr=tw -Ddeploy.dir=/gamejelly/repo-server/webroot_gms_tw -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_tw
ant -f build.xml -Ddeploy.opr=tw -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_tw cp_tools_deploy
#ant -f build.xml -Ddeploy.opr=ios -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_ios cp_tools_deploy
#ant -f build.xml -Ddeploy.opr=anzhuo -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_anzhuo cp_tools_deploy