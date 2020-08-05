pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "cleaning pre existed jar"
                bat "./mvnw clean"
                echo "cleaning pre existed jar"
                bat "./mvnw compile"
            }
        }
        stage('Unit Test') {
            steps {
                echo "running unit tests"
                bat './mvnw test'
            }
        }
        stage('Publish Test Coverage Report') {
            steps {
              jacoco(execPattern: 'target/*.exec')
            }
        }
        stage('Building Jar') {
            steps {
                bat './mvnw install'
            }
        }
    }
}
