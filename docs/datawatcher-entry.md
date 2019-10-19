# DataWatcherEntry
[**DataWatcherEntry**](javadoc/fr/il_totore/entitymetadata/api/datawatcher/DataWatcherEntry.html)
  is an object to support multiples versions for DataWatchers. It allow to put
  an index and a [**DataWatcherKey**](javadoc/fr/il_totore/entitymetadata/api/datawatcher/DataWatcherKey.html) with a version.
  This is an example with the [**Ghast**](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Ghast.html) attack animation:
  ```java
DataWatcherEntry entry = new DataWatcherEntry().addVersion(new VersionEntry<>(ServerVersion.v1_8_4, DataWatcherKey.BYTE, 16))
    .addVersion(new VersionEntry<>(ServerVersion.v1_9, DataWatcherKey.BOOLEAN, 11))
    .addVersion(new VersionEntry<>(ServerVersion.v1_10, DataWatcherKey.BOOLEAN, 12));
```