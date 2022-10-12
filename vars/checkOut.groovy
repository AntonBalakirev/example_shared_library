def call(branch) {
    checkout(
            [$class: 'GitSCM',
             branches: [[name: "refs/heads/${branch}"]],
             userRemoteConfigs: [[url: 'https://github.com/AntonBalakirev/pizza_order_automation.git']]]
    )
}