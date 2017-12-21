#!/bin/sh

echo PWD: $PWD
svn up
mvn compile
mvn -Djetty.port=9901 jetty:run