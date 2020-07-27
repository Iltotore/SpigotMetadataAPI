
![Logo](logo.png)
A spigot library to easily change internal data without taking care of version.

![Build badge](https://img.shields.io/github/workflow/status/Iltotore/SpigotMetadataAPI/Java%20CI/master) ![Security Badge](https://snyk.io/test/github/Iltotore/SpigotMetadataAPI/badge.svg) ![License Badge](https://img.shields.io/github/license/Iltotore/SpigotMetadataAPI) ![Release badge](https://img.shields.io/github/v/release/Iltotore/SpigotMetadataAPI)

## Description
SpigotMetadataAPI is an API to edit entities/blocks/items's data from 1.8.8 to 1.16.1. It allows Spigot developers to access Minecraft entities features that Spigot doesn't support without worry about version.

## Features
### [NBT Support](https://github.com/Iltotore/SpigotMetadataAPI/wiki/NBT)
This project allow users to edit metadatable's NBT and edit Minecraft NBT files (.dat) like players's one. You can for example edit the position, the inventory, potion effects etc... of an offline player.

### [DataWatcher Support](https://github.com/Iltotore/SpigotMetadataAPI/wiki/DataWatcher)
You can using this librairy edit entities's DataWatcher. You can for example enable/disable Player's skin parts, set arrow count on a Player, trigger animations like EnderCrystal and Guardian beam, or the Evoker summoning animation.

See also https://wiki.vg/Entity_metadata

## Add to your project
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
	<artifactId>spigotmetadataapi</artifactId>
	<version>version</version>
</dependency>
```

Gradle:
- Repository
```gradle
repositories {
	maven { url 'https://raw.githubusercontent.com/Iltotore/maven/master' }
}
```
- Dependency
```gradle
dependencies {
	implementation 'fr.il_totore:spigotmetadataapi:version'
}
```

## Usage
- [**Javadoc**](https://iltotore.github.io/SpigotMetadataAPI/javadoc/)
- [**Wiki**](https://github.com/Iltotore/SpigotMetadataAPI/wiki)

## Download sources
- **Step 1**: Clone this repository
- **Step 2**: Run the `buildTools` task to download NMS dependencies. A valid `MAVEN_HOME` path is recommended. Note the first execution will take several minutes. Next builds will be faster.

## Contributing
You can contribute to this project by creating Issues and upgrading the project.
see [CONTRIBUTING.md](https://github.com/Iltotore/SpigotMetadataAPI/blob/master/CONTRIBUTING.md) for more informations


If this project helped you, don't forget to help it by giving a star <3
