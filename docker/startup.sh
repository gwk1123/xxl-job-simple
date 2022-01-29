APPNAME=xxljobsimple
PORT=8092
docker build -t $APPNAME .
docker run -itd --name $APPNAME -p $PORT:$PORT -v /logs/applogs:/data/applogs  $APPNAME
