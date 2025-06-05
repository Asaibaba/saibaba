pipeline {
    agent any

    environment {
        GIT_REPO = 'https://github.com/Asaibaba/saibaba.git'
    }

    stages {
        stage('Clone') {
            steps {
                git url: "${GIT_REPO}", branch: 'main'
            }
        }
        stage('Build') {
            steps {
                sh 'echo "Building the code..."'
                // Example: mvn clean install or npm install
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Running tests..."'
                // Example: mvn test or npm test
            }
        }
        stage('Package') {
            steps {
                sh 'echo "Packaging..."'
                // Example: docker build -t yourimage .
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploying..."'
                // Example: docker run -d yourimage
            }
        }
    }
}
