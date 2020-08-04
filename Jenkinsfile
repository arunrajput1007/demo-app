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
        stage('Publish Test Coverage Report') {
            steps {
              step([$class: 'JacocoPublisher',
                   execPattern: '**/build/jacoco/*.exec',
                   classPattern: '**/build/classes',
                   sourcePattern: 'src/main/java',
                   exclusionPattern: 'src/test*'])
            }
        }
        stage('Building Jar') {
            steps {
                sh 'mvn install'
            }
        }
    }
}
