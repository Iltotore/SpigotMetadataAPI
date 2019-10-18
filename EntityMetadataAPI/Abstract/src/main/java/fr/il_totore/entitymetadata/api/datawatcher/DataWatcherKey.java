package fr.il_totore.entitymetadata.api.datawatcher;

import com.google.common.base.Optional;
import fr.il_totore.entitymetadata.api.nbt.NBTTagCompound;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

import java.util.UUID;

public class DataWatcherKey<T> {

    private String key;

    /**
     * Create a new DataWatcherKey with a key
     * @param key the key of this {@link DataWatcherKey}. Note this key must be unique
     */
    public DataWatcherKey(String key){
        this.key = key;
    }

    /**
     * Create a new DataWatcherKey with the class's name
     * @param clazz the given class
     */
    public DataWatcherKey(Class<T> clazz){
        this(clazz.getName());
    }

    /**
     * Get the key.
     * @return the {@link DataWatcherKey}'s key
     */
    public String getKey(){
        return key;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof DataWatcherKey)) return false;
        return key.equals(((DataWatcherKey) obj).getKey());
    }

    @Override
    public int hashCode(){
        return key.hashCode();
    }

    public static final DataWatcherKey<Boolean> BOOLEAN = new DataWatcherKey<>(boolean.class);
    public static final DataWatcherKey<Byte> BYTE = new DataWatcherKey<>(byte.class);
    public static final DataWatcherKey<Short> SHORT = new DataWatcherKey<>(short.class);
    public static final DataWatcherKey<Integer> INT = new DataWatcherKey<>(int.class);
    public static final DataWatcherKey<Long> LONG = new DataWatcherKey<>(long.class);
    public static final DataWatcherKey<Float> FLOAT = new DataWatcherKey<>(float.class);
    public static final DataWatcherKey<Double> DOUBLE = new DataWatcherKey<>(double.class);
    public static final DataWatcherKey<String> STRING = new DataWatcherKey<>(String.class);
    public static final DataWatcherKey<Optional<UUID>> OPTIONAL_UUID = new DataWatcherKey<>("optional_uuid");

    public static final DataWatcherKey<Vector> VECTOR = new DataWatcherKey<>("vector3f");
    public static final DataWatcherKey<Vector> POSITION = new DataWatcherKey<>("position");
    public static final DataWatcherKey<Optional<Vector>> OPTIONAL_POSITION = new DataWatcherKey<>("optional_position");
    public static final DataWatcherKey<BaseComponent> CHAT_COMPONENT = new DataWatcherKey<>("chat");
    public static final DataWatcherKey<Optional<BaseComponent>> OPTIONAL_CHAT_COMPONENT = new DataWatcherKey<>("optional_chat");
    public static final DataWatcherKey<EulerAngle> ROTATION = new DataWatcherKey<>("rotation");
    public static final DataWatcherKey<BlockFace> BLOCK_FACE = new DataWatcherKey<>("block_face");
    public static final DataWatcherKey<Optional<ItemStack>> OPTIONAL_ITEM_STACK = new DataWatcherKey<>("optional_item_stack");

    //Since 1.12
    public static final DataWatcherKey<NBTTagCompound> NBT_TAG = new DataWatcherKey<>("nbt_tag");
}
