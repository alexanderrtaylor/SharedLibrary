def call(config) {
  withCredentials([usernamePassword(credentialsId: "ff563f73-d280-4e99-a21d-0fb1a18ea795", passwordVariable: "AWS_SECRET_ACCESS_KEY", usernameVariable: "AWS_ACCESS_KEY_ID")]) {
      sh script:libraryResource("scripts/deploy/display.sh")
  } 
}
