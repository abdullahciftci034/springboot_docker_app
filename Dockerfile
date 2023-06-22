FROM goyalzz/ubuntu-java-8-maven-docker-image
COPY ./ /home/springboot_docker_liveserver
WORKDIR  /home/springboot_docker_liveserver
CMD ["mvn","spring-boot:run"]