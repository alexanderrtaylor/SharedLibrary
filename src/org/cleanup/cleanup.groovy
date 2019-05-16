cleanup {
stage('Clean') {
post {
	always {
		cleanWs()
		}
	}
}
}
