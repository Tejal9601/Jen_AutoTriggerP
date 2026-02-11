pipeline {
    agent any

    tools {
        jdk 'jdk21'
        maven 'maven3'
    }

    stages {

        stage('Verify Tools') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Clean Project') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Run Automation Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }

        success {
            echo '✅ Tests Passed Successfully!'
        }

        failure {
            echo '❌ Tests Failed!'
        }
    }
}
