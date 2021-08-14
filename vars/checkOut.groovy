def call(branch) {
    checkout(
            [$class: 'GitSCM',
             branches: [[name: "refs/heads/${branch}"]],
             userRemoteConfigs: [[url: 'https://github.com/AntonBalakirev/cucumber_example.git']]]
    )
}