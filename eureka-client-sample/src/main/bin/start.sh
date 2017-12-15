PRG_PATH=$(dirname $0)
PRG_HOME=$(readlink -f $PRG_PATH/..)
LIB_PATH=$PRG_HOME/lib
CONF_PATH=$PRG_HOME/config
CLASS_PATH=$CONF_PATH:$LIB_PATH:$LIB_PATH/*

BOOT_CLASS=com.viki.eurekaClientSample.EurekaClientApplication
JAVA_OPTS="-Xms1024M -Xmx1024M -XX:MaxPermSize=512M -XX:PermSize=512M -Dfile.encoding=UTF-8"
JAVA_ENV="-DLOG_HOME=$PRG_HOME/logs -DAPP_HOST=$(hostname)-$(whoami)"

java -cp $CLASS_PATH $JAVA_OPTS $JAVA_ENV $BOOT_CLASS 
