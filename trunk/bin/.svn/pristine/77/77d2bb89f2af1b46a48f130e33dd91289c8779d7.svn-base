#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR/../
ant -f build.xml -Ddeploy.opr=hd -Ddeploy.dir=/gamejelly/repo-server/webroot_gms_hd -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_hd
ant -f build.xml -Ddeploy.opr=hd -Dopt.deploy.dir=/gamejelly/repo-server/tools_gms_hd cp_tools_deploy
