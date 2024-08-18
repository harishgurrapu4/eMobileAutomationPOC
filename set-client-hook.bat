@echo off

git fetch https://bitbucket.eclinicalworks.com/scm/buil/git-client-hook.git
git checkout FETCH_HEAD -- hooks

set source=%cd%\hooks\*
set destination=%cd%\.git\hooks\
xcopy %source% %destination% /y
if exist %destination%\commit-msg.sample ( del  %destination%commit-msg.sample  /f /q )

git rm -r --cached hooks
git config commit.template ./.git/hooks/commit.txt

@RD /q /s %cd%\hooks
