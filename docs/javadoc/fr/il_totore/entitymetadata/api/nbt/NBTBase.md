NBTBase (EntityMetadata 1.0-SNAPSHOT API)

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

fr.il\_totore.entitymetadata.api.nbt

## Interface NBTBase ##

 *  All Superinterfaces:
    
    java.lang.Cloneable
    
    All Known Subinterfaces:
    
    NBTNumber<V>, NBTSingleValue<T>, NBTTagCompound, NBTTagEnd, NBTTagList
    
    --------------------
    
      
    
    
        public interface NBTBase
        extends java.lang.Cloneable

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
           <td><code><a title="class in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagType</a></code></td> 
           <td><code><span><a rel="nofollow">getType</a></span>()</code> 
            <div>
             Get the NBTTag's type
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>boolean</code></td> 
           <td><code><span><a rel="nofollow">isEmpty</a></span>()</code> 
            <div>
             Check if the 
             <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTBase</code></a> is empty
            </div> </td> 
          </tr> 
         </tbody>
        </table>

 *   *  ### Method Detail ###
        
         *  #### isEmpty ####
            
                boolean isEmpty()
            
            Check if the `NBTBase` is empty
            
            Returns:
            
            true if empty
        
         *  #### getType ####
            
                NBTTagType getType()
            
            Get the NBTTag's type
            
            Returns:
            
            the `NBTTagType`

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