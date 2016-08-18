#!/usr/bin/env bash

set -ev

# Get current branch
BRANCH=$(git branch | sed -n -e 's/^\* \(.*\)/\1/p')
echo "Running build on branch $BRANCH."

# Execute Build
./gradlew clean build

# Only execute the maven deploy steps on master
if [ "$BRANCH" = "master" ]; then
  ./gradlew bintrayUpload
fi
