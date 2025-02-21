#!/usr/bin/env bash
 for dir in $(find . -name "pom.xml" -exec dirname {} \;); do
          MODULE_NAME=$(basename $dir)
          echo "$MODULE_NAME version: $VERSION"
          echo "VERSION_$MODULE_NAME=$VERSION" >> $GITHUB_ENV
        done