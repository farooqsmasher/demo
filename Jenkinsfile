pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                timeout(time: 5, units: 'MINUTES'){
                sh 'mvn test'
                }
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
               
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }  
     
    }
}