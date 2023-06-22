FROM goyalzz/ubuntu-java-8-maven-docker-image
COPY ./ /home/springbootappname
WORKDIR  /home/springbootappname
CMD ["mvn","spring-boot:run"]