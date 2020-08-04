pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "cleaning pre existed jar"
                sh 'mvn clean'
                echo "cleaning pre existed jar"
                sh 'mvn compile'
            }
        }
        stage('Unit Test') {
            steps {
                echo "running unit tests"
                sh 'mvn test'
            }
        }
        stage('Building Jar') {
            steps {
                sh 'mvn install'
            }
        }
    }
}