pipeline {
    agent any
    tools {
            maven 'maven:latest'
        }
    stages {
        stage('env info') {
            steps {
                bat 'mvn --version'
                bat 'java -version'
            }
        }
    }
}