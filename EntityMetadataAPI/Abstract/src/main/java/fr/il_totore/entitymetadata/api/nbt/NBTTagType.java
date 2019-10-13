package fr.il_totore.entitymetadata.api.nbt;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NBTTagType<T extends NBTBase> {

    private static Set<NBTTagType> values = new HashSet<>();

    private int id;

    private NBTTagType(int id){
        this.id = id;
    }

    /**
     * get the {@link NBTTagType}'s id
     * @return the constant's id.
     */
    public int getId(){
        return id;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public int hashCode(){
        return id;
    }

    /**
     * Get the NBTTagType from it's id.
     * @param id
     * @return
     */
    public static NBTTagType getById(int id){
        for(NBTTagType type : values()) if(type.getId() == id) return type;
        return null;
    }

    /**
     * @see Enum
     */
    public static NBTTagType[] values(){
        return values.toArray(new NBTTagType[]{});
    }

    /**
     * Register a {@link NBTTagType}
     * @param nbtTagType the {@link NBTTagType} to register
     * @param <T> the generic type of the {@link NBTTagType}
     * @return the given {@link NBTTagType}
     */
    private static <T extends NBTBase> NBTTagType<T> register(NBTTagType<T> nbtTagType){
        values.add(nbtTagType);
        return nbtTagType;
    }

    public static final NBTTagType<NBTTagEnd> END = register(new NBTTagType<>(0));
    public static final NBTTagType<NBTNumber<Byte>> BYTE = register(new NBTTagType<>(1));
    public static final NBTTagType<NBTNumber<Short>> SHORT = register(new NBTTagType<>(2));
    public static final NBTTagType<NBTNumber<Integer>> INT = register(new NBTTagType<>(3));
    public static final NBTTagType<NBTNumber<Long>> LONG = register(new NBTTagType<>(4));
    public static final NBTTagType<NBTNumber<Float>> FLOAT = register(new NBTTagType<>(5));
    public static final NBTTagType<NBTNumber<Double>> DOUBLE = register(new NBTTagType<>(6));
    public static final NBTTagType<NBTSingleValue<List<Byte>>> BYTE_ARRAY = register(new NBTTagType<>(7));
    public static final NBTTagType<NBTSingleValue<String>> STRING = register(new NBTTagType<>(8));
    public static final NBTTagType<NBTTagList> LIST = register(new NBTTagType<>(9));
    public static final NBTTagType<NBTTagCompound> COMPOUND = register(new NBTTagType<>(10));
    public static final NBTTagType<NBTSingleValue<List<Integer>>> INT_ARRAY = register(new NBTTagType<>(11));
}
