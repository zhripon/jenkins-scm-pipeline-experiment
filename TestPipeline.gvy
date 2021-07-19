pipeline {
    agent any

    stages{
        stage('test stage 1') {
            steps{
                script{
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
                }
            }

            post {
                failure {
                    input(message: "Proceed to next stage")
                }
            }
        }
        stage('test stage 2'){
            steps{
                script{
                    stage('ES 4') {
                        steps {
                            echo 'Hello world'
                        }
                    }
                }
            }
        }

    }
}
