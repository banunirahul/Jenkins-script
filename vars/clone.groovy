def clone(String giturl, String gitbranch) {
    echo "Starting Code Clone stage from ${giturl} branch ${gitbranch}"
    git url: giturl,branch: gitbranch
}
