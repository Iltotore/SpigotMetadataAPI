package fr.il_totore.entitymetadata.api.nbt;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class NBTOutputStream extends DataOutputStream {

    private NBTManager nbtManager;

    /**
     * Creates a new {@link NBTOutputStream} to write NBTTags to the specified
     * underlying output stream. The counter <code>written</code> is
     * set to zero.
     *
     * @param nbtManager the {@link NBTManager} instance
     * @param out        the underlying output stream, to be saved for later use.
     * @see FilterOutputStream#out
     */
    public NBTOutputStream(NBTManager nbtManager, OutputStream out) {
        super(out);
        this.nbtManager = nbtManager;
    }

    @SuppressWarnings("unchecked")
    public void writeTag(NBTBase nbtBase) throws IOException {
        writeTag(nbtBase.getType(), nbtBase);
    }

    public <T extends NBTBase> void writeTag(NBTTagType<T> nbtTagType, T nbtBase) throws IOException {
        writeByte(nbtTagType.getId());
        nbtManager.getSerializer(nbtTagType).write(nbtManager, this, nbtBase);
    }

    @SuppressWarnings("unchecked")
    public void writeNamedTag(NamedNBT nbt) throws IOException {
        writeNamedTag(nbt.getType(), nbt);
    }

    public <T extends NBTBase> void writeNamedTag(NBTTagType<T> nbtTagType, NamedNBT<T> nbt) throws IOException {
        writeByte(nbtTagType.getId());
        writeUTF(nbt.getName());
        nbtManager.getSerializer(nbtTagType).write(nbtManager, this, nbt.getValue());
    }
}
