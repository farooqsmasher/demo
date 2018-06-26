pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
       stage ('Compile Stage') {

            steps {
                sh 'mvn clean compile'
            }
        }
        stage('deploy') {
            steps {
                sh 'echo "deploy"'
            }
        }   
     
    }
}