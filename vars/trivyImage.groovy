def call() {
    sh 'trivy image devopsbasic/youtube:latest > trivyimage.txt'
}