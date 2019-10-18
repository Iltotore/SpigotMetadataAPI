
# EntityMetadataAPI
A spigot librairy to easily change internals entity data without taking care of version.

## Description
EntityMetadataAPI is an API to edit entities's data from 1.8.8 to 1.14.4. It support NBT tags and [DataWatchers](https://wiki.vg/Entity_metadata).

## Add to project
This library can be added to your buildpath locally using your IDE (Eclipse: Java Build Path → Depedencies, IntelliJ IDEA: Project Structure → Librairies).

You can also use Maven or Gradle to add this library.

[Jitpack](https://jitpack.io/#Iltotore/EntityMetadataAPI) will be used in these examples.

Maven:
- Repository:
```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```
- Dependency:
```xml
<dependency>
	<groupId>com.github.Iltotore</groupId>
	<artifactId>EntityMetdataAPI</artifactId>
	<version>Tag</version>
</dependency>
```

Gradle:
- Repository
```groovy
repositories {
	...
	maven { url 'https://jitpack.io' }
}
```
- Dependency
```groovy
dependencies {
	implementation 'com.github.Iltotore:EntityMetadataAPI:Tag'
}
```

## Usage
### NBT tags
You can edit entities's NBT tags with this librairy.
Firstly, you need to get the entity's [NBTTagCompound](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/nbt/NBTTagCompound.html) by using [MetadataUtil#getNBTTag(Entity)](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/MetadataUtil.html#getNBTTag-org.bukkit.entity.Entity-).
```java
MetadataUtil metadataUtil = EntityMetadataAPI.getAPI().getMetadataUtil();
NBTTagCompound nbtTag = metadataUtil.getNBTTag(entity);
```

Now you can edit the entity's [NBTTagCompound](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/nbt/NBTTagCompound.html).
```java
nbtTag.setInt("Fire", 100); # Ignites the entity for 100 ticks (5 seconds)
```

Now, you need to update the entity's tags.
```java
metadataUtil.setNBTTag(entity, nbtTag);
```

### Datawatchers
Datawatchers entries are non-persistent entities's values sent to the Player.

Firstly, you need to get the entity's [DataWatcher](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/datawatcher/DataWatcher.html).
```java
MetadataUtil metadataUtil = EntityMetadataAPI.getAPI().getMetadataUtil();
# An EnderCrystal will be used for this example
DataWatcher dataWatcher = metadataUtil.getDataWatcher(enderCrystal);
```
Secondly, you need to get the [DataWatcherObject](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/datawatcher/DataWatcherObject.html) instance that point to the targetted value.
```java
DataWatcherRegistry dataRegistry = 
EntityMetadataAPI.getAPI().getDataWatcherRegistry();

/* The DataWatcherSerializer contains functions to convert the input
to the NMS equivalent*/
DataWatcherSerializer<Vector, ?> dataSerializer = dataRegistry.getSerializer(
	/* The type serializer'key. It define the serialier id,
	the input and output generic types. */
	DataWatcherKey.OPTIONAL_POSITION);
	
# The value index can be found in https://wiki.vg/Entity_metadata
DataWatcherObject<Vector, ?> dataObject = dataSerializer.index(6);
```

Now you can use [DataWatcher#set(DataWatcherObject<F, T>, F)](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/datawatcher/DataWatcher.html#set-fr.il_totore.entitymetadata.api.datawatcher.DataWatcherObject-F-).
```java
# Set the enderCrystal's beam to 0, 0, 0.
dataWatcher.set(dataObject, new Vector(0, 0, 0);
```
