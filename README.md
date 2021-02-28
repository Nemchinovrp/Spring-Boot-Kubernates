
Сборка образа - "docker build -t springboot-k8s-deployment ." 

docker tag <IMAGE ID> nemchinovrp/springboot-k8s-deployment:0.0.2

docker push nemchinovrp/springboot-k8s-deployment:0.0.1


Удаление всех образов - "docker system prune -a"
