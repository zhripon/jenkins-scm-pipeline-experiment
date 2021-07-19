pipeline {
    agent any

    stages{
        stages('test stage 1') {
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
            }
            stage('ES 3') {
                steps {
                    echo 'Hello pipeline'
                }
            }

            post {
                failure {
                    input(message: "Proceed to next stage")
                }
            }
        }
        stages('test stage 2'){
            stage('ES 4') {
                steps {
                    echo 'Hello world'
                }
            }
        }

    }
}
