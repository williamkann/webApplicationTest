pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo Build'
      }
    }

    stage('Back End') {
      parallel {
        stage('Unit Test') {
          steps {
            sh '''echo Unit test

'''
          }
        }

        stage('Performance ') {
          steps {
            sh 'echo Performance'
          }
        }

      }
    }

    stage('Front End') {
      steps {
        sh 'echo Front End'
      }
    }

    stage('Static analysis') {
      steps {
        sh 'echo Analysis'
      }
    }

    stage('Deployement') {
      steps {
        sh 'echo Deployement'
      }
    }

  }
}