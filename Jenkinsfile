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
        sh '/bin/cp ./target/demo-test.jar /app/server/'
        sh 'java -jar /app/server/demo-test.jar'
      }
    }

    stage('verify') {
      steps {
        sh 'echo "success!"'
      }
    }

  }
}
