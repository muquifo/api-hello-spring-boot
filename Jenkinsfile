pipeline {
  agent any
  stages {
    stage('BUILD') {
      steps {
        echo 'Iniciando Build'
        withMaven(maven: 'maven', mavenSettingsConfig: 'ab6e2cf0-e05b-4926-b7e6-b112c7c990ae') {
          sh 'mvn clean package'
        }
        
      }
    }
    stage('TEST') {
      steps {
        echo 'Iniciando Testes...'
        withMaven(maven: 'maven', mavenSettingsConfig: 'ab6e2cf0-e05b-4926-b7e6-b112c7c990ae') {
          sh 'mvn test'
        }
        
      }
    }
  }
  environment {
    agent = 'master'
  }
}