pipeline {
    agent any
    tools {
            maven 'Maven 3.6.3'
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