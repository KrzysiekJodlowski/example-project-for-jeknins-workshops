pipeline {
    agent any
    tools {
            maven 'Maven 3.6.3'
        }
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
            }
        }
    }
}