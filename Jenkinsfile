pipeline {
  agent any
  stages {
    stage('BUILD') {
      steps {
        echo 'Iniciando Build...'
        sh 'mvn clean package'
      }
    }
    stage('TEST') {
      steps {
        echo 'Iniciando Testes...'
        sh 'mvn test'
      }
    }
  }
  environment {
    agent = 'master'
  }
}