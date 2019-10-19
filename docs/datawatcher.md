# DataWatcher
Datawatchers items are non-persistent entities's values sent to the Player.

Firstly, you need to get the entity's [DataWatcher](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/datawatcher/DataWatcher.html).
```java
MetadataUtil metadataUtil = EntityMetadataAPI.getAPI().getMetadataUtil();
//An EnderCrystal will be used for this example
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
	
//The value index can be found in https://wiki.vg/Entity_metadata
DataWatcherObject<Vector, ?> dataObject = dataSerializer.index(6);
```

Now you can use [DataWatcher#set(DataWatcherObject<F, T>, F)](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/datawatcher/DataWatcher.html#set-fr.il_totore.entitymetadata.api.datawatcher.DataWatcherObject-F-).
```java
//Set the enderCrystal's beam to 0, 0, 0.
dataWatcher.set(dataObject, new Vector(0, 0, 0);
```

Index can change between versions. You can use [**DataWatcherEntry**](datawatcher-entry) to support multiples versions