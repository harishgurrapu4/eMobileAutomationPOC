git fetch https://bitbucket.eclinicalworks.com/scm/buil/git-client-hook.git
git checkout FETCH_HEAD -- hooks

source=`dirname 0`/hooks/*
destination=`dirname 0`/.git/hooks
cp $source $destination

chmod +x $destination/*

if [ -f $destination/commit-msg.sample ]
  then
	rm  $destination/commit-msg.sample
  fi

git rm -r --cached hooks
git config commit.template ./.git/hooks/commit.txt

rm -rf `dirname 0`/hooks 
