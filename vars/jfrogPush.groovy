def call(){
  sh """curl-X PUT-u admin -T /var/lib/jenkins/workspace/jfrogPush/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://35.174.211.196/artifactory/example-repo-local/"""  
}
