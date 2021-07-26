pipeline {
    agent any

    stages{
        stage('test stage 1') {
            steps{
                script{
                    stage('ES 1') {
                        sh 'echo HelloWorld'
                        input(message: "Proceed to next stage")
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
