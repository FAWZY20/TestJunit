pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Apache Maven 3.8.6"
    }
  

    stages {
        
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/FAWZY20/TestJunit.git'
            }
        }
        
        stage('Build the application') {
            steps {
               sh 'mvn clean install'
            }
        }
        
        stage('Unit Test Execution') {
            steps{
                sh 'mvn test'
            }
            
        }
        
    }
}

pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Apache Maven 3.8.6"
    }

    stages {
        
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/FAWZY20/TestJunit.git'
            }
        }
        
        stage('Build the application') {
            steps {
               sh 'mvn clean install'
            }
        }
        
        stage('Unit Test Execution') {
            steps{
                sh 'mvn test'
            }
            
        }
        
    }
}

