pipeline {
    agent any
  
    stages {
        stage("build") {
            steps {
                echo 'building the application'
                withGradle() {
                    sh 'gradlew build'
                }
            }
        }
        stage("test") {
            steps {
                echo 'testing the application'
            }
        }
        stage("deploy") {
            steps {
                echo 'deploying the application'
            }
        }
    }
}
