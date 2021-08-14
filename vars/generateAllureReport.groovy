def call() {
    allure includeProperties: false,
            jdk: '',
            results: [[path: 'target/reports/allure-results']]
}