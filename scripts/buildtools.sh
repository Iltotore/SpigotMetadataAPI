echo "Building ${1}"
if "mvn" dependency:get -Dartifact="org.spigotmc:spigot-api:${1}-R0.1-SNAPSHOT"; then
  echo "${1} is already installed ! Skipping..."
else
  java -jar BuildTools.jar --rev "${1}"
fi