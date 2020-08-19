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
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
