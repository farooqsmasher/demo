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
                withMaven(maven : '3.0.5') {
                    sh 'mvn clean compile'
                }
            }
        }
        stage('deploy') {
            steps {
                sh 'echo "deploy"'
            }
        }   
     
    }
}