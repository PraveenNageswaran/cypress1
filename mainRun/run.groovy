pipeline {
    agent none
    stages {
            stage('print welcome message') {
            steps{
                echo 'Hello'
            }
            
        }
        stage('Slack integration') {
            steps {
                slackSend  baseUrl:'prashantiworkspace.slack.com',channel: 'spring', color: 'blue', message: 'welcome', teamDomain: 'prashanti', tokenCredentialId: 'Slack', username: 'prawin.nageswaran'
            }
        }
    }
}