pipeline {
  agent any
  stages {
    stage('Test') {
      agent any
      steps {
        bat 'echo test'
        
      }
    }

    stage('Build') {

   	agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                bat 'mvn -B -DskipTests clean package' 
            }
        }
    }



    stage('Backend') {
      parallel {
        stage('Unit') {
          steps {
            bat 'echo Unit'
          }
        }

        stage('Performance') {
          steps {
            bat 'echo Performance'
          }
        }

      }
    }

    stage('Frontend') {
      steps {
        bat 'echo Frontend'
      }
    }

    stage('Static Analysis') {
      steps {
        bat 'echo Static Analysis'
      }
    }

    stage('Deploy') {
      steps {
        bat 'echo Deploy'
      }
    }

  }
}
