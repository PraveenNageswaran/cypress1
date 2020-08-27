pipeline {
    stages {
        stage('print welcome message') {
            steps{
                print 'Hello'
            }
            
        }
    }
}