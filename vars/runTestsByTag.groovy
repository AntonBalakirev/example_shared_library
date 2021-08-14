def call(mvnPath, tags) {
    sh "${mvnPath} test -Dcucumber.filter.tags=\"${tags}\""
}