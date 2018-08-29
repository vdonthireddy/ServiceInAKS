mvn clean install
docker build -t serviceinaks .
docker tag serviceinaks vdonthireddy/serviceinaks:2.0
docker push vdonthireddy/serviceinaks:2.0
kubectl delete deploy vjservice-deployment & kubectl delete service vjservice-service
kubectl apply -f aks.yml
#kubectl get services --watch
