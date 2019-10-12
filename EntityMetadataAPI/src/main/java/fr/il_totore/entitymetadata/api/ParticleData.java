package fr.il_totore.entitymetadata.api;

import org.bukkit.Particle;

public class ParticleData<T> {

    private Particle particle;
    private T data;

    @SuppressWarnings("unchecked")
    public ParticleData(Particle particle, T data){
        this.particle = particle;
        if(data == null) return;
        if(!particle.getDataType().isInstance(data))
            throw new IllegalArgumentException(data + " isn't instance of " + particle.getDataType().getName());
        this.data = (T) particle.getDataType().cast(data);
    }

    public Particle getParticle(){
        return particle;
    }

    public T getData(){
        return data;
    }
}
