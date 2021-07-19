pipeline {
    agent any

    stages{
        stage('test stage 1') {
            steps{
                script{
                    stage('ES 1') {
                        steps {
                            sh 'echo HelloWorld'
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
                            sh 'echo pipeLine'
                        }
                    }
                }
            }

            // post {
            //     always {
            //         input(message: "Proceed to next stage")
            //     }
            // }
        }
        stage('test stage 2'){
            steps{
                script{
                    stage('ES 4') {
                        steps {
                            sh 'echo HelloWorld'
                        }
                    }
                }
            }
        }

    }
}
