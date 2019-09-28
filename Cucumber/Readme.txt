To initiate browsers:
docker run -d -p 4545:4444 -p 5900:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome-debug:3.141.59-vanadium
docker run -d -p 4444:4444 -p 5901:5900 -v /dev/shm:/dev/shm selenium/standalone-firefox-debug:3.141.59-vanadium


To check running services:
docker ps -a


to delete a container:
docker rm --force <CONTAINER ID>


Grid:

docker run -d -p 4545:4444 --name selenium-hub selenium/hub
docker run -d -P --link  selenium-hub:hub selenium/node-chrome-debug
docker run -d -P --link  selenium-hub:hub selenium/node-firefox-debug

##############################zalenium################################################

docker run --rm -ti --name zalenium -p 4444:4444  -v /var/run/docker.sock:/var/run/docker.sock  -v /tmp/videos:/home/seluser/videos --privileged dosel/zalenium start

http://localhost:4444/grid/admin/live

http://localhost:4444/grid/console

http://localhost:4444/dashboard/#

