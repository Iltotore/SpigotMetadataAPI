NBTTagList (EntityMetadata 1.0-SNAPSHOT API)

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

## Interface NBTTagList ##

 *  All Superinterfaces:
    
    java.lang.Cloneable, NBTBase
    
    --------------------
    
      
    
    
        public interface NBTTagList
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
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">add</a></span>(<a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTBase</a>&nbsp;nbtBase)</code> 
            <div>
             Add a 
             <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTBase</code></a>
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTBase</a></code></td> 
           <td><code><span><a rel="nofollow">get</a></span>(int&nbsp;i)</code> 
            <div>
             Get the 
             <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTBase</code></a> at the given index
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagCompound</a></code></td> 
           <td><code><span><a rel="nofollow">getCompound</a></span>(int&nbsp;i)</code> 
            <div>
             Get the 
             <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTTagCompound</code></a> at the given index
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTNumber</a></code></td> 
           <td><code><span><a rel="nofollow">getNumber</a></span>(int&nbsp;i)</code> 
            <div>
             Get the 
             <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTNumber</code></a> at the given index
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>java.lang.String</code></td> 
           <td><code><span><a rel="nofollow">getString</a></span>(int&nbsp;i)</code> 
            <div>
             Get the 
             <code>String</code> at the given index
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="class in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagType</a></code></td> 
           <td><code><span><a rel="nofollow">getType</a></span>()</code> 
            <div>
             Get the NBTTag's type
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">remove</a></span>(int&nbsp;i)</code> 
            <div>
             Remove an element at the given index
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">set</a></span>(int&nbsp;i, <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTBase</a>&nbsp;nbtBase)</code> 
            <div>
             Set a 
             <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTBase</code></a> at the given index
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>int</code></td> 
           <td><code><span><a rel="nofollow">size</a></span>()</code> 
            <div>
             Get the 
             <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTTagList</code></a>'s size
            </div> </td> 
          </tr> 
         </tbody>
        </table>
        
         *  ### Methods inherited from interface fr.il\_totore.entitymetadata.api.nbt.NBTBase ###
            
            `isEmpty`

 *   *  ### Method Detail ###
        
         *  #### add ####
            
                void add(NBTBase nbtBase)
            
            Add a `NBTBase`
            
            Parameters:
            
            `nbtBase` \- the element to be added
        
         *  #### set ####
            
                void set(int i,
                         NBTBase nbtBase)
            
            Set a `NBTBase` at the given index
            
            Parameters:
            
            `i` \- the index to set the element
            
            `nbtBase` \- the element to set
        
         *  #### remove ####
            
                void remove(int i)
            
            Remove an element at the given index
            
            Parameters:
            
            `i` \- the element to remove's index
        
         *  #### get ####
            
                NBTBase get(int i)
            
            Get the `NBTBase` at the given index
            
            Parameters:
            
            `i` \- location of the `NBTBase`
            
            Returns:
            
            the `NBTBase` at the given index
        
         *  #### getCompound ####
            
                NBTTagCompound getCompound(int i)
            
            Get the `NBTTagCompound` at the given index
            
            Parameters:
            
            `i` \- location of the `NBTTagCompound`
            
            Returns:
            
            the `NBTTagCompound` at the given index
        
         *  #### getNumber ####
            
                NBTNumber getNumber(int i)
            
            Get the `NBTNumber` at the given index
            
            Parameters:
            
            `i` \- location of the `NBTNumber`
            
            Returns:
            
            the `NBTNumber` at the given index
        
         *  #### getString ####
            
                java.lang.String getString(int i)
            
            Get the `String` at the given index
            
            Parameters:
            
            `i` \- location of the `String`
            
            Returns:
            
            the `String` at the given index
        
         *  #### size ####
            
                int size()
            
            Get the `NBTTagList`'s size
            
            Returns:
            
            the list's size
        
         *  #### getType ####
            
                NBTTagType getType()
            
            Get the NBTTag's type
            
            Specified by:
            
            `getType` in interface `NBTBase`
            
            Returns:
            
            `NBTTagType.LIST`

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