pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "cleaning pre existed jar"
                bat 'mvn clean'
                echo "cleaning pre existed jar"
                bat 'mvn compile'
            }
        }
        stage('Unit Test') {
            steps {
                echo "running unit tests"
                bat 'mvn test'
            }
        }
        stage('Publish Test Coverage Report') {
            steps {
              jacoco(execPattern: 'target/*.exec')
            }
        }
        stage('Building Jar') {
            steps {
                bat 'mvn install'
            }
        }
    }
}
