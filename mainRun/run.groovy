pipeline {
    agent any
    stages {
            stage('print welcome message') {
            steps{
                echo 'Hello'
            }
            
        }
    }
}