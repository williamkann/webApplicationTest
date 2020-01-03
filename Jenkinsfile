pipeline {
    agent {
        docker {
            image 'ubuntu' 
            bat 'echo oui'
        }
    }
    stages {
        stage('Build') { 
            steps {
                bat 'mvn -B -DskipTests clean package' 
            }
        }
    }
}