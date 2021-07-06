package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

import fr.il_totore.spigotmetadata.api.nbt.NBTManager;
import fr.il_totore.spigotmetadata.api.nbt.NBTNumber;
import fr.il_totore.spigotmetadata.api.nbt.NBTSingleValue;
import fr.il_totore.spigotmetadata.api.nbt.NBTTagType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NBTTagList extends NBTBase<net.minecraft.nbt.NBTTagList> implements fr.il_totore.spigotmetadata.api.nbt.NBTTagList {

    public NBTTagList(net.minecraft.nbt.NBTTagList handle) {
        super(handle);
    }

    @Override
    public void add(fr.il_totore.spigotmetadata.api.nbt.NBTBase nbtBase) {
        assert nbtBase instanceof NBTBase : "Invalid version";
        getHandle().add(((NBTBase<?>) nbtBase).getHandle());
    }

    @Override
    public void addAll(Collection<fr.il_totore.spigotmetadata.api.nbt.NBTBase> nbtBases) {
        nbtBases.forEach(this::add);
    }

    @Override
    public void set(int i, fr.il_totore.spigotmetadata.api.nbt.NBTBase nbtBase) {
        assert nbtBase instanceof NBTBase : "Invalid version";
        getHandle().a(i, ((NBTBase<?>) nbtBase).getHandle());
    }

    @Override
    public void remove(int i) {
        getHandle().remove(i);
    }

    @Override
    public NBTTagCompound getCompound(int i) {
        return new NBTTagCompound(getHandle().getCompound(i));
    }

    @Override
    public NBTNumber<Float> getFloat(int i) {
        return new NBTTagFloat(net.minecraft.nbt.NBTTagFloat.a(getHandle().i(i)));
    }

    @Override
    public NBTNumber<Double> getDouble(int i) {
        return new NBTTagDouble(net.minecraft.nbt.NBTTagDouble.a(getHandle().h(i)));
    }

    @Override
    public NBTSingleValue<List<Integer>> getIntArray(int i) {
        return new NBTTagIntArray(new net.minecraft.nbt.NBTTagIntArray(getHandle().f(i)));
    }

    @Override
    public NBTSingleValue<String> getString(int i) {
        return new NBTTagString(net.minecraft.nbt.NBTTagString.a(getHandle().getString(i)));
    }

    @Override
    public Collection<fr.il_totore.spigotmetadata.api.nbt.NBTBase> getTags(NBTManager nbtManager) {
        List<fr.il_totore.spigotmetadata.api.nbt.NBTBase> nbtBases = new ArrayList<>();
        for(int i = 0; i < size(); i++) {
            nbtBases.add(get(nbtManager, i));
        }
        return nbtBases;
    }

    @Override
    public int size() {
        return getHandle().size();
    }

    @Override
    public NBTTagType<?> getValueType() {
        return NBTTagType.getById(getHandle().getTypeId());
    }
}
