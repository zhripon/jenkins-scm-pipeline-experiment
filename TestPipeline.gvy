pipeline {
    agent any

    stages{
        stage('test stage 1') {
            steps{
                script{
                    jenkins.model.Jenkins.get.computers.each { c ->
                        if (c.node.labelString.contains(label)) {
                            echo c.node.selfLabel.name
                        }
                    }
                }
            }
        }
    }
}
