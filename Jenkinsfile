pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
         withMaven(maven:'maven'){
           sh 'mvn clean build'
         }
      }
    }
  }
}
