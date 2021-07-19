pipeline {
    agent any

    stages{
        stage('test stage 1') {
            steps{
                script{
                    stage('ES 1') {
                        step {
                            sh 'echo HelloWorld'
                        }
                    }
                    stage('ES 2') {
                        step {
                            catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                                bat "fdfd sdfds"
                            }
                        }
                    }
                    stage('ES 3') {
                        step {
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
                        step {
                            sh 'echo HelloWorld'
                        }
                    }
                }
            }
        }
    }
}
