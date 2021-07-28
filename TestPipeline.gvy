pipeline {
    agent any

    stages{
        stage('test stage 1') {
            steps{
                bat "powershell.exe -ExecutionPolicy Bypass -File \"testscript.ps1\" "
            }
        }
    }
}
