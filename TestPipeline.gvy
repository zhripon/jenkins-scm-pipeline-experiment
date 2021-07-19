pipeline {
    agent any

    stages{
        stage('test stage 1') {
            steps{
                script{
                    stage('ES 1') {
                        sh 'echo HelloWorld'
                    }
                    stage('ES 2') {
                        catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                            bat "fdfd sdfds"
                        }
                    }
                    stage('ES 3') {
                        sh 'echo pipeLine'
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
                        sh 'echo HelloWorld'
                    }
                }
            }
        }
    }
}
