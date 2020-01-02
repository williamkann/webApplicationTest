pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'echo Build'
      }
    }

    stage('Back End') {
      parallel {
        stage('Unit Test') {
          steps {
            bat '''echo Unit test

'''
          }
        }

        stage('Performance ') {
          steps {
            bat 'echo Performance'
          }
        }

      }
    }

    stage('Front End') {
      steps {
        bat 'echo Front End'
      }
    }

    stage('Static analysis') {
      steps {
        bat 'echo Analysis'
      }
    }

    stage('Deployement') {
      steps {
        bat 'echo Deployement'
      }
    }

  }
}
