MetadataUtil (EntityMetadata 1.0-SNAPSHOT API)

JavaScript is disabled on your browser.

Skip navigation links

 *  Overview
 *  Package
 *  Class
 *  Tree
 *  Deprecated
 *  Index
 *  Help

 *  Prev Class
 *  Next Class

 *  Frames
 *  No Frames

 *  All Classes

 *  Summary:
 *  Nested |
 *  Field |
 *  Constr |
 *  Method

 *  Detail:
 *  Field |
 *  Constr |
 *  Method

fr.il\_totore.entitymetadata.api

## Interface MetadataUtil ##

 *  --------------------
    
      
    
    
        public interface MetadataUtil

 *   *  ### Method Summary ###
        
        <table> 
         <span><span>All Methods</span><span>&nbsp;</span></span>
         <span><span><a rel="nofollow">Instance Methods</a></span><span>&nbsp;</span></span>
         <span><span><a rel="nofollow">Abstract Methods</a></span><span>&nbsp;</span></span> 
         <tbody>
          <tr> 
           <th>Modifier and Type</th> 
           <th>Method and Description</th> 
          </tr> 
          <tr> 
           <td><code><a title="interface in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcher</a></code></td> 
           <td><code><span><a rel="nofollow">getDataWatcher</a></span>(org.bukkit.entity.Entity&nbsp;entity)</code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code><a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagCompound</a></code></td> 
           <td><code><span><a rel="nofollow">getNBTTag</a></span>(org.bukkit.entity.Entity&nbsp;entity)</code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>&lt;V,T extends <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTBase</a>&gt;<br>T</code></td> 
           <td><code><span><a rel="nofollow">nbtOf</a></span>(<a title="class in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagType</a>&lt;T&gt;&nbsp;type, V&nbsp;value)</code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setNBTTag</a></span>(org.bukkit.entity.Entity&nbsp;entity, <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagCompound</a>&nbsp;nbtTagCompound)</code>&nbsp;</td> 
          </tr> 
         </tbody>
        </table>

 *   *  ### Method Detail ###
        
         *  #### getDataWatcher ####
            
                DataWatcher getDataWatcher(org.bukkit.entity.Entity entity)
        
         *  #### getNBTTag ####
            
                NBTTagCompound getNBTTag(org.bukkit.entity.Entity entity)
        
         *  #### setNBTTag ####
            
                void setNBTTag(org.bukkit.entity.Entity entity,
                               NBTTagCompound nbtTagCompound)
        
         *  #### nbtOf ####
            
                <V,T extends NBTBase> T nbtOf(NBTTagType<T> type,
                                              V value)

Skip navigation links

 *  Overview
 *  Package
 *  Class
 *  Tree
 *  Deprecated
 *  Index
 *  Help

 *  Prev Class
 *  Next Class

 *  Frames
 *  No Frames

 *  All Classes

 *  Summary:
 *  Nested |
 *  Field |
 *  Constr |
 *  Method

 *  Detail:
 *  Field |
 *  Constr |
 *  Method