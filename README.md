```sh
mvn clean install
docker build -t serviceinaks .
docker tag serviceinaks <your docker repo>:<tag name>
docker push <your docker repo>:<tag name>
kubectl apply -f aks.yml
```