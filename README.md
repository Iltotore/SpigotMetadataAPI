
# EntityMetadataAPI
A spigot library to easily change internals entity data without taking care of version.

![Build badge](https://img.shields.io/github/workflow/status/Iltotore/EntityMetadataAPI/Java%20CI/master) ![License Badge](https://img.shields.io/github/license/Iltotore/EntityMetadataAPI) ![Release badge](https://img.shields.io/github/v/release/Iltotore/EntityMetadataAPI)

## Description
EntityMetadataAPI is an API to edit entities's data from 1.8.8 to 1.14.4. It support NBT tags and [DataWatchers](https://wiki.vg/Entity_metadata). It allows Spigot developers to access Minecraft features that Spigot doesn't support without worry about version. You can also use this API to edit NBT files like players's one. You can for example edit the position, the inventory, potion effects etc... of an offline player.


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
- [**Wiki**](https://github.com/Iltotore/EntityMetadataAPI/wiki)
