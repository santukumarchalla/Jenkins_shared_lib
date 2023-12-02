def call() {
  echo '------executing jfrog'
  sh """ curl -X PUT -u admin:Admin@123-T /var/lib/jenkins/workspace/JfrogArtf/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://18.212.17.198:8081
  }
