pipeline {
  agent none
  stages {
    stage('Build') {
      steps {
        echo 'Building'
      }
    }

    stage('Test') {
      steps {
        echo 'Testing'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying'
      }
    }

    stage('verify') {
      steps {
        sh 'echo "success!"'
      }
    }

  }
}