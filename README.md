
# EntityMetadataAPI
A spigot library to easily change internals entity data without taking care of version.

## Description
EntityMetadataAPI is an API to edit entities's data from 1.8.8 to 1.14.4. It support NBT tags and [DataWatchers](https://wiki.vg/Entity_metadata).

## Add to project
This library can be added to your buildpath locally using your IDE (Eclipse: Java Build Path → Depedencies, IntelliJ IDEA: Project Structure → Librairies).

You can also use Maven or Gradle to add this library.

Maven:
- Repository:
```xml
<repositories>
	<repository>
		<id>il_totore</id>
		<url>https://raw.githubusercontent.com/Iltotore/maven/master/</url>
	</repository>
</repositories>
```
- Dependency:
```xml
<dependency>
	<groupId>fr.il_totore</groupId>
	<artifactId>entitymetadatapi</artifactId>
	<version>Tag</version>
</dependency>
```

Gradle:
- Repository
```groovy
repositories {
	...
	maven { url 'https://raw.githubusercontent.com/Iltotore/maven/master' }
}
```
- Dependency
```groovy
dependencies {
	implementation 'fr.il_totore:entitymetadataapi:Tag'
}
```

## Usage
- [**Javadoc**](https://iltotore.github.io/EntityMetadataAPI/javadoc/)
- [**DataWatcher usage**](https://iltotore.github.io/EntityMetadataAPI/datawatcher)
- [**NBT usage**](https://iltotore.github.io/EntityMetadataAPI/nbt)
