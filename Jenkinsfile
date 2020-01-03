pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            sh 'echo oui'
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}