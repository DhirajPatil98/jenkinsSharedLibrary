def call(String DockerHubUser, String ProjectName, String ImageTag){

echo " Pushing on docker hub"
withCredentials([usernamePassword('credentialsId':"DOckerHubCreds", passwordVariable:"DockerHubPas", usernameVariable:"DockerHubUser")]){
sh "docker login -u ${env.DockerHubUser} -p ${DockerHubPas}"
}
sh "docker push ${DockerHubUser}/"${ProjectName}":"${ImageTag}"

}
