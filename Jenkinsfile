pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               sh 'mvn -v' 
               sh 'mvn install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
