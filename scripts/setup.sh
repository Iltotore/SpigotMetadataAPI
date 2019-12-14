mkdir ../work
cd ../work
echo "Downloading BuildTools"
cd ../work
rm -f BuildTools.jar
if [ "${no-check-certificate}" ] ; then
  wget https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar --no-check-certificate
else
  wget https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar
fi
echo "Building versions"
../scripts/buildtools.sh "1.8.8"
../scripts/buildtools.sh "1.9"
../scripts/buildtools.sh "1.9.4"
../scripts/buildtools.sh "1.10.2"
../scripts/buildtools.sh "1.11"
../scripts/buildtools.sh "1.12.2"
../scripts/buildtools.sh "1.13"
../scripts/buildtools.sh "1.13.2"
../scripts/buildtools.sh "1.14.4"
../scripts/buildtools.sh "1.15"

echo "Successfully built versions"