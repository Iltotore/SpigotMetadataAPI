DataWatcherKey (EntityMetadata 1.0-SNAPSHOT API)

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

fr.il\_totore.entitymetadata.api.datawatcher

## Class DataWatcherKey<T> ##

 *  java.lang.Object
 *   *  fr.il\_totore.entitymetadata.api.datawatcher.DataWatcherKey<T>

 *  --------------------
    
      
    
    
        public class DataWatcherKey<T>
        extends java.lang.Object

 *   *  ### Field Summary ###
        
        <table> 
         <span>Fields</span>
         <span>&nbsp;</span> 
         <tbody>
          <tr> 
           <th>Modifier and Type</th> 
           <th>Field and Description</th> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;org.bukkit.block.BlockFace&gt;</code></td> 
           <td><code><span><a rel="nofollow">BLOCK_FACE</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;java.lang.Boolean&gt;</code></td> 
           <td><code><span><a rel="nofollow">BOOLEAN</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;java.lang.Byte&gt;</code></td> 
           <td><code><span><a rel="nofollow">BYTE</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;net.md_5.bungee.api.chat.BaseComponent&gt;</code></td> 
           <td><code><span><a rel="nofollow">CHAT_COMPONENT</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;java.lang.Double&gt;</code></td> 
           <td><code><span><a rel="nofollow">DOUBLE</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;java.lang.Float&gt;</code></td> 
           <td><code><span><a rel="nofollow">FLOAT</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;java.lang.Integer&gt;</code></td> 
           <td><code><span><a rel="nofollow">INT</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;java.lang.Long&gt;</code></td> 
           <td><code><span><a rel="nofollow">LONG</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;<a title="interface in fr.il_totore.entitymetadata.api.nbt" rel="nofollow">NBTTagCompound</a>&gt;</code></td> 
           <td><code><span><a rel="nofollow">NBT_TAG</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;com.google.common.base.Optional&lt;net.md_5.bungee.api.chat.BaseComponent&gt;&gt;</code></td> 
           <td><code><span><a rel="nofollow">OPTIONAL_CHAT_COMPONENT</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;com.google.common.base.Optional&lt;org.bukkit.inventory.ItemStack&gt;&gt;</code></td> 
           <td><code><span><a rel="nofollow">OPTIONAL_ITEM_STACK</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;com.google.common.base.Optional&lt;org.bukkit.util.Vector&gt;&gt;</code></td> 
           <td><code><span><a rel="nofollow">OPTIONAL_POSITION</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;com.google.common.base.Optional&lt;java.util.UUID&gt;&gt;</code></td> 
           <td><code><span><a rel="nofollow">OPTIONAL_UUID</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;org.bukkit.util.Vector&gt;</code></td> 
           <td><code><span><a rel="nofollow">POSITION</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;org.bukkit.util.EulerAngle&gt;</code></td> 
           <td><code><span><a rel="nofollow">ROTATION</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;java.lang.Short&gt;</code></td> 
           <td><code><span><a rel="nofollow">SHORT</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;java.lang.String&gt;</code></td> 
           <td><code><span><a rel="nofollow">STRING</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;org.bukkit.util.Vector&gt;</code></td> 
           <td><code><span><a rel="nofollow">VECTOR</a></span></code>&nbsp;</td> 
          </tr> 
         </tbody>
        </table>
    
     *  ### Constructor Summary ###
        
        <table> 
         <span>Constructors</span>
         <span>&nbsp;</span> 
         <tbody>
          <tr> 
           <th>Constructor and Description</th> 
          </tr> 
          <tr> 
           <td><code><span><a rel="nofollow">DataWatcherKey</a></span>(java.lang.Class&lt;<a title="type parameter in DataWatcherKey" rel="nofollow">T</a>&gt;&nbsp;clazz)</code> 
            <div>
             Create a new DataWatcherKey with the class's name
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><span><a rel="nofollow">DataWatcherKey</a></span>(java.lang.String&nbsp;key)</code> 
            <div>
             Create a new DataWatcherKey with a key
            </div> </td> 
          </tr> 
         </tbody>
        </table>
    
     *  ### Method Summary ###
        
        <table> 
         <span><span>All Methods</span><span>&nbsp;</span></span>
         <span><span><a rel="nofollow">Instance Methods</a></span><span>&nbsp;</span></span>
         <span><span><a rel="nofollow">Concrete Methods</a></span><span>&nbsp;</span></span> 
         <tbody>
          <tr> 
           <th>Modifier and Type</th> 
           <th>Method and Description</th> 
          </tr> 
          <tr> 
           <td><code>boolean</code></td> 
           <td><code><span><a rel="nofollow">equals</a></span>(java.lang.Object&nbsp;obj)</code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>java.lang.String</code></td> 
           <td><code><span><a rel="nofollow">getKey</a></span>()</code> 
            <div>
             Get the key.
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>int</code></td> 
           <td><code><span><a rel="nofollow">hashCode</a></span>()</code>&nbsp;</td> 
          </tr> 
         </tbody>
        </table>
        
         *  ### Methods inherited from class java.lang.Object ###
            
            `clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

 *   *  ### Field Detail ###
        
         *  #### BOOLEAN ####
            
                public static final DataWatcherKey<java.lang.Boolean> BOOLEAN
        
         *  #### BYTE ####
            
                public static final DataWatcherKey<java.lang.Byte> BYTE
        
         *  #### SHORT ####
            
                public static final DataWatcherKey<java.lang.Short> SHORT
        
         *  #### INT ####
            
                public static final DataWatcherKey<java.lang.Integer> INT
        
         *  #### LONG ####
            
                public static final DataWatcherKey<java.lang.Long> LONG
        
         *  #### FLOAT ####
            
                public static final DataWatcherKey<java.lang.Float> FLOAT
        
         *  #### DOUBLE ####
            
                public static final DataWatcherKey<java.lang.Double> DOUBLE
        
         *  #### STRING ####
            
                public static final DataWatcherKey<java.lang.String> STRING
        
         *  #### OPTIONAL\_UUID ####
            
                public static final DataWatcherKey<com.google.common.base.Optional<java.util.UUID>> OPTIONAL_UUID
        
         *  #### VECTOR ####
            
                public static final DataWatcherKey<org.bukkit.util.Vector> VECTOR
        
         *  #### POSITION ####
            
                public static final DataWatcherKey<org.bukkit.util.Vector> POSITION
        
         *  #### OPTIONAL\_POSITION ####
            
                public static final DataWatcherKey<com.google.common.base.Optional<org.bukkit.util.Vector>> OPTIONAL_POSITION
        
         *  #### CHAT\_COMPONENT ####
            
                public static final DataWatcherKey<net.md_5.bungee.api.chat.BaseComponent> CHAT_COMPONENT
        
         *  #### OPTIONAL\_CHAT\_COMPONENT ####
            
                public static final DataWatcherKey<com.google.common.base.Optional<net.md_5.bungee.api.chat.BaseComponent>> OPTIONAL_CHAT_COMPONENT
        
         *  #### ROTATION ####
            
                public static final DataWatcherKey<org.bukkit.util.EulerAngle> ROTATION
        
         *  #### BLOCK\_FACE ####
            
                public static final DataWatcherKey<org.bukkit.block.BlockFace> BLOCK_FACE
        
         *  #### OPTIONAL\_ITEM\_STACK ####
            
                public static final DataWatcherKey<com.google.common.base.Optional<org.bukkit.inventory.ItemStack>> OPTIONAL_ITEM_STACK
        
         *  #### NBT\_TAG ####
            
                public static final DataWatcherKey<NBTTagCompound> NBT_TAG
    
     *  ### Constructor Detail ###
        
         *  #### DataWatcherKey ####
            
                public DataWatcherKey(java.lang.String key)
            
            Create a new DataWatcherKey with a key
            
            Parameters:
            
            `key` \- the key of this `DataWatcherKey`. Note this key must be unique
        
         *  #### DataWatcherKey ####
            
                public DataWatcherKey(java.lang.Class<T> clazz)
            
            Create a new DataWatcherKey with the class's name
            
            Parameters:
            
            `clazz` \- the given class
    
     *  ### Method Detail ###
        
         *  #### getKey ####
            
                public java.lang.String getKey()
            
            Get the key.
            
            Returns:
            
            the `DataWatcherKey`'s key
        
         *  #### equals ####
            
                public boolean equals(java.lang.Object obj)
            
            Overrides:
            
            `equals` in class `java.lang.Object`
        
         *  #### hashCode ####
            
                public int hashCode()
            
            Overrides:
            
            `hashCode` in class `java.lang.Object`

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