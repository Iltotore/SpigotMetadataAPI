
![Logo](logo.png)
A spigot library to easily change internals entity data without taking care of version.

![Build badge](https://img.shields.io/github/workflow/status/Iltotore/EntityMetadataAPI/Java%20CI/master) ![Security Badge](https://snyk.io/test/github/Iltotore/EntityMetadataAPI/badge.svg) ![License Badge](https://img.shields.io/github/license/Iltotore/EntityMetadataAPI) ![Release badge](https://img.shields.io/github/v/release/Iltotore/EntityMetadataAPI)

## Description
EntityMetadataAPI is an API to edit entities's data from 1.8.8 to 1.15. It allows Spigot developers to access Minecraft entities features that Spigot doesn't support without worry about version.

## Features
### [NBT Support](https://github.com/Iltotore/EntityMetadataAPI/wiki/NBT)
This project allow users to edit entites's NBT and edit Minecraft NBT files (.dat) like players's one. You can for example edit the position, the inventory, potion effects etc... of an offline player.

### [DataWatcher Support](https://github.com/Iltotore/EntityMetadataAPI/wiki/DataWatcher)
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
	<artifactId>entitymetadatapi</artifactId>
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
	implementation 'fr.il_totore:entitymetadataapi:version'
}
```

## Usage
- [**Javadoc**](https://iltotore.github.io/EntityMetadataAPI/javadoc/)
- [**Wiki**](https://github.com/Iltotore/EntityMetadataAPI/wiki)

## Download sources
- **Step 1**: Clone this repository
- **Step 2**: Run `sh setup.sh` in the `scripts` folder to download NMS dependencies.

## Contributing
You can contribute to this project by creating Issues and upgrading the project.
see [CONTRIBUTING.md](https://github.com/Iltotore/EntityMetadataAPI/blob/master/CONTRIBUTING.md) for more informations


If this project helped you, don't forget to help it by giving a star <3
