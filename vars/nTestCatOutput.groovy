def call(config) {
  withCredentials([usernamePassword(credentialsId: "5fb5b459-dc80-4be9-a570-b0e419a5a35f", passwordVariable: "AWS_SECRET_ACCESS_KEY", usernameVariable: "AWS_ACCESS_KEY_ID")]) {
      sh script:libraryResource("scripts/deploy/display.sh")
  } 
}
