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
        stage('build') {
             steps {
                 bat 'mvn compile'
                 bat 'mvn package'
             }
        }
        stage('sleep') {
             steps {
                 sleep(time: 1, unit: 'MINUTES')
                 bat 'echo Hello world'
             }
        }
    }
}