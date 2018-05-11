pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
         withMaven(maven:'maven', mavenSettingsConfig: 'maven-conf'){
           sh 'mvn clean package'
         }
      }
    }
  }
}
