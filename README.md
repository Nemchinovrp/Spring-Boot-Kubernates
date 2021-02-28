
Сборка образа - "docker build -t springboot_kubernates ." 

запуск контейнера - "docker run -p 8080:8080 springboot_kubernates"

docker tag <IMAGE ID> nemchinovrp/springboot_kubernates:0.0.1

docker push nemchinovrp/springboot_kubernates:0.0.1


Удаление всех образов - "docker system prune -a"
