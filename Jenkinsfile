pipeline {
    agent any

    tools {
        jdk 'JAVA_HOME'   // Make sure this matches your Jenkins JDK tool name
        maven 'M2_HOME'   // Make sure this matches your Jenkins Maven tool name
    }

    stages {

        stage('Start') {
            steps {
                echo "=== Starting the Pipeline ==="
            }
        }

        stage('Git Checkout') {
            steps {
                echo "=== Cloning Git Repository ==="
                git branch: 'main', url: 'https://github.com/AlaaBenJeddi29/SpringBootBackendCafe.git'
            }
        }

        stage('Build & Compile') {
            steps {
                echo "=== Running Maven Build ==="
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                success {
                    echo "=== Build SUCCESS! Recording tests and archiving artifacts ==="
                    // Record test results (if any)
                    junit 'target/surefire-reports/TEST-*.xml'
                    // Archive built JAR file
                    archiveArtifacts 'target/*.jar'
                }
                failure {
                    echo "=== Build FAILED! Check Maven output ==="
                }
            }
        }

        stage('Finish') {
            steps {
                echo "=== Pipeline Finished ==="
            }
        }
    }

    post {
        always {
            echo "=== Pipeline Completed ==="
        }
    }
}
