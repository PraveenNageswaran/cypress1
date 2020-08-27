pipeline {
    agent none
    stages {
            stage('print welcome message') {
            steps{
                echo 'Hello'
            }
            
        }
    }
}