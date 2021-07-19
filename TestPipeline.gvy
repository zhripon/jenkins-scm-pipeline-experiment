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
                echo 'Hello jenkins'
            }
        }
    }
}
