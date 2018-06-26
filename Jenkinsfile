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
       stage('Testing') {
            steps {
                sh 'mvn test'
               def mvnHome = tool 'Maven 3.0.5'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }  
     
    }
}