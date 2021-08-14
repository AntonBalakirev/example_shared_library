def call(mvnPath) {
    sh "${mvnPath} clean compile"
}