pipeline {
    agent any
    stages {
            stage('print welcome message') {
            steps{
                print 'Hello'
            }
            
        }
    }
}