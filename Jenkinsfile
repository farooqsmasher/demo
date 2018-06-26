pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn test'
            }
        }
        stage('test') {
            steps {
                sh 'echo "testing"'
            }
        }
        stage('deploy') {
            steps {
                sh 'echo "deploy"'
            }
    }
}