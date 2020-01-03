pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v //C:/Program Files (x86)/Jenkins/workspace/webApplicationTest://root/.m2' 
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