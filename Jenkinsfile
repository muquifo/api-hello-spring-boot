pipeline {
  agent any
  stages {
    stage('BUILD') {
      steps {
        echo 'Iniciando Build...'
        withMaven(maven: 'maven', globalMavenSettingsConfig: 'maven-config') {
          sh 'mvn clean package'
        }
        
      }
    }
    stage('TEST') {
      steps {
        echo 'Iniciando Testes...'
        withMaven(maven: 'maven', globalMavenSettingsConfig: 'maven-config') {
          sh 'mvn test'
        }
        
      }
    }
  }
  environment {
    agent = 'master'
  }
}