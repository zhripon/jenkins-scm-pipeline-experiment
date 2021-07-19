pipeline {
    agent any

    stages {
        stage('ES 1') {
            steps {
                echo 'Hello world'
            }
        }
        stage('ES 2') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    bat "fdfd sdfds"
                }
                echo 'Hello jenkins'
            }
            failure {
                input(message: "Proceed to next stage")
            }
        }
        stage('ES 3') {
            steps {
                echo 'Hello pipeline'
            }
        }
    }
}
