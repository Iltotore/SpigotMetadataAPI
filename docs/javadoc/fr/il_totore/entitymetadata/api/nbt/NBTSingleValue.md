NBTSingleValue (EntityMetadata 1.0-SNAPSHOT API)

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

## Interface NBTSingleValue<T> ##

 *  All Superinterfaces:
    
    java.lang.Cloneable, NBTBase
    
    All Known Subinterfaces:
    
    NBTNumber<V>
    
    --------------------
    
      
    
    
        public interface NBTSingleValue<T>
        extends NBTBase

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
           <td><code><a title="type parameter in NBTSingleValue" rel="nofollow">T</a></code></td> 
           <td><code><span><a rel="nofollow">get</a></span>()</code> 
            <div>
             Get the NBT's value
            </div> </td> 
          </tr> 
         </tbody>
        </table>
        
         *  ### Methods inherited from interface fr.il\_totore.entitymetadata.api.nbt.NBTBase ###
            
            `getType, isEmpty`

 *   *  ### Method Detail ###
        
         *  #### get ####
            
                T get()
            
            Get the NBT's value
            
            Returns:
            
            the NBT's value as T

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