# NBT
You can edit entities's NBT tags with this library.
Firstly, you need to get the entity's [NBTTagCompound](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/nbt/NBTTagCompound.html) by using [MetadataUtil#getNBTTag(Entity)](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/MetadataUtil.html#getNBTTag-org.bukkit.entity.Entity-).
```java
MetadataUtil metadataUtil = EntityMetadataAPI.getAPI().getMetadataUtil();
NBTTagCompound nbtTag = metadataUtil.getNBTTag(entity);
```

Now you can edit the entity's [NBTTagCompound](https://iltotore.github.io/EntityMetadataAPI/javadoc/fr/il_totore/entitymetadata/api/nbt/NBTTagCompound.html).
```java
nbtTag.setInt("Fire", 100); //Ignites the entity for 100 ticks (5 seconds)
```

Now, you need to update the entity's tags.
```java
metadataUtil.setNBTTag(entity, nbtTag);
```