NBTTagCompound (EntityMetadata 1.0-SNAPSHOT API)

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

## Interface NBTTagCompound ##

 *  All Superinterfaces:
    
    java.lang.Cloneable, NBTBase
    
    --------------------
    
      
    
    
        public interface NBTTagCompound
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
           <td><code>boolean</code></td> 
           <td><code><span><a rel="nofollow">getBoolean</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>byte</code></td> 
           <td><code><span><a rel="nofollow">getByte</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>byte[]</code></td> 
           <td><code><span><a rel="nofollow">getByteArray</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagCompound</a></code></td> 
           <td><code><span><a rel="nofollow">getCompound</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>double</code></td> 
           <td><code><span><a rel="nofollow">getDouble</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>float</code></td> 
           <td><code><span><a rel="nofollow">getFloat</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>int</code></td> 
           <td><code><span><a rel="nofollow">getInt</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>int[]</code></td> 
           <td><code><span><a rel="nofollow">getIntArray</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagList</a></code></td> 
           <td><code><span><a rel="nofollow">getList</a></span>(java.lang.String&nbsp;key, <a title="class in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagType</a>&nbsp;type)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>long</code></td> 
           <td><code><span><a rel="nofollow">getLong</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>short</code></td> 
           <td><code><span><a rel="nofollow">getShort</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>java.lang.String</code></td> 
           <td><code><span><a rel="nofollow">getString</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Get the value associated to the given key
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
           <td><code><a title="class in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagType</a></code></td> 
           <td><code><span><a rel="nofollow">getTypeOf</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             return the 
             <a title="class in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTTagType</code></a> of the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>boolean</code></td> 
           <td><code><span><a rel="nofollow">hasKey</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             check if the given key exists
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>boolean</code></td> 
           <td><code><span><a rel="nofollow">hasKeyOfType</a></span>(java.lang.String&nbsp;key, <a title="class in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagType</a>&nbsp;type)</code> 
            <div>
             Check if the 
             <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTTagCompound</code></a> has a value of the given 
             <a title="class in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTTagType</code></a> associated with the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>boolean</code></td> 
           <td><code><span><a rel="nofollow">isEmpty</a></span>()</code> 
            <div>
             Check if the 
             <a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow"><code>NBTTagCompound</code></a> is empty
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">remove</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Remove the value associated to the given key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setBoolean</a></span>(java.lang.String&nbsp;key, boolean&nbsp;value)</code> 
            <div>
             Put the given boolean value with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setByte</a></span>(java.lang.String&nbsp;key, byte&nbsp;value)</code> 
            <div>
             Put the given byte value with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setByteArray</a></span>(java.lang.String&nbsp;key, byte[]&nbsp;value)</code> 
            <div>
             Put the given byte array with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setDouble</a></span>(java.lang.String&nbsp;key, double&nbsp;value)</code> 
            <div>
             Put the given double value with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setFloat</a></span>(java.lang.String&nbsp;key, float&nbsp;value)</code> 
            <div>
             Put the given float value with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setInt</a></span>(java.lang.String&nbsp;key, int&nbsp;value)</code> 
            <div>
             Put the given int value with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setIntArray</a></span>(java.lang.String&nbsp;key, int[]&nbsp;value)</code> 
            <div>
             Put the given int array with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setLong</a></span>(java.lang.String&nbsp;key, long&nbsp;value)</code> 
            <div>
             Put the given long value with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setShort</a></span>(java.lang.String&nbsp;key, short&nbsp;value)</code> 
            <div>
             Put the given short value with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">setString</a></span>(java.lang.String&nbsp;key, java.lang.String&nbsp;value)</code> 
            <div>
             Put the given 
             <code>String</code> value with the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>java.util.Set&lt;java.lang.String&gt;</code></td> 
           <td><code><span><a rel="nofollow">toSet</a></span>()</code>&nbsp;</td> 
          </tr> 
         </tbody>
        </table>

 *   *  ### Method Detail ###
        
         *  #### setByte ####
            
                void setByte(java.lang.String key,
                             byte value)
            
            Put the given byte value with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### setShort ####
            
                void setShort(java.lang.String key,
                              short value)
            
            Put the given short value with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### setInt ####
            
                void setInt(java.lang.String key,
                            int value)
            
            Put the given int value with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### setLong ####
            
                void setLong(java.lang.String key,
                             long value)
            
            Put the given long value with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### setFloat ####
            
                void setFloat(java.lang.String key,
                              float value)
            
            Put the given float value with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### setDouble ####
            
                void setDouble(java.lang.String key,
                               double value)
            
            Put the given double value with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### setString ####
            
                void setString(java.lang.String key,
                               java.lang.String value)
            
            Put the given `String` value with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### setByteArray ####
            
                void setByteArray(java.lang.String key,
                                  byte[] value)
            
            Put the given byte array with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### setIntArray ####
            
                void setIntArray(java.lang.String key,
                                 int[] value)
            
            Put the given int array with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### setBoolean ####
            
                void setBoolean(java.lang.String key,
                                boolean value)
            
            Put the given boolean value with the key.
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `value` \- the value to put with the key
        
         *  #### getByte ####
            
                byte getByte(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getShort ####
            
                short getShort(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getInt ####
            
                int getInt(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getLong ####
            
                long getLong(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getFloat ####
            
                float getFloat(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getDouble ####
            
                double getDouble(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getString ####
            
                java.lang.String getString(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getByteArray ####
            
                byte[] getByteArray(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getIntArray ####
            
                int[] getIntArray(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getCompound ####
            
                NBTTagCompound getCompound(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getList ####
            
                NBTTagList getList(java.lang.String key,
                                   NBTTagType type)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            `type` \- the `NBTTagType` of the `NBTTagList`
            
            Returns:
            
            the value associated to the given key
        
         *  #### getBoolean ####
            
                boolean getBoolean(java.lang.String key)
            
            Get the value associated to the given key
            
            Parameters:
            
            `key` \- the given key as `String`
            
            Returns:
            
            the value associated to the given key
        
         *  #### remove ####
            
                void remove(java.lang.String key)
            
            Remove the value associated to the given key
            
            Parameters:
            
            `key` \- the key of the entry to remove
        
         *  #### getTypeOf ####
            
                NBTTagType getTypeOf(java.lang.String key)
            
            return the `NBTTagType` of the value associated to the given key
            
            Parameters:
            
            `key` \- the key of the value
            
            Returns:
            
            the `NBTTagType` of the value at the given key
        
         *  #### hasKey ####
            
                boolean hasKey(java.lang.String key)
            
            check if the given key exists
            
            Parameters:
            
            `key` \- the given key
            
            Returns:
            
            true if an entry with the given key exists
        
         *  #### hasKeyOfType ####
            
                boolean hasKeyOfType(java.lang.String key,
                                     NBTTagType type)
            
            Check if the `NBTTagCompound` has a value of the given `NBTTagType` associated with the given key
            
            Parameters:
            
            `key` \- the given key
            
            `type` \- the type co compare
            
            Returns:
            
            true if a value associated with the given key is of the given type
        
         *  #### isEmpty ####
            
                boolean isEmpty()
            
            Check if the `NBTTagCompound` is empty
            
            Specified by:
            
            `isEmpty` in interface `NBTBase`
            
            Returns:
            
            true if empty
        
         *  #### toSet ####
            
                java.util.Set<java.lang.String> toSet()
            
            Returns:
            
            a set of the `NBTTagCompound` keys
        
         *  #### getType ####
            
                NBTTagType getType()
            
            Get the NBTTag's type
            
            Specified by:
            
            `getType` in interface `NBTBase`
            
            Returns:
            
            `NBTTagType.COMPOUND`

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