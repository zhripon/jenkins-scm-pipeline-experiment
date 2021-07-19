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
                    fgeerg
                }
                echo 'Hello jenkins'
            }
        }
        stage('ES 3') {
            steps {
                echo 'Hello pipeline'
            }
        }
    }
}
