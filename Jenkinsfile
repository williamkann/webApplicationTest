pipeline {
    agent {
        docker {
            image 'ubuntu' 
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