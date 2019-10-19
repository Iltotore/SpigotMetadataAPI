DataWatcherEntry.VersionEntry (EntityMetadata 1.0-SNAPSHOT API)

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

## Class DataWatcherEntry.VersionEntry<T> ##

 *  java.lang.Object
 *   *  fr.il\_totore.entitymetadata.api.datawatcher.DataWatcherEntry.VersionEntry<T>

 *  All Implemented Interfaces:
    
    java.lang.Comparable<DataWatcherEntry.VersionEntry<?>>
    
    Enclosing class:
    
    DataWatcherEntry
    
    --------------------
    
      
    
    
        public static class DataWatcherEntry.VersionEntry<T>
        extends java.lang.Object
        implements java.lang.Comparable<DataWatcherEntry.VersionEntry<?>>

 *   *  ### Constructor Summary ###
        
        <table> 
         <span>Constructors</span>
         <span>&nbsp;</span> 
         <tbody>
          <tr> 
           <th>Constructor and Description</th> 
          </tr> 
          <tr> 
           <td><code><span><a rel="nofollow">VersionEntry</a></span>(<a title="class in fr.il_totore.entitymetadata.util" rel="nofollow">ServerVersion</a>&nbsp;version, <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;<a title="type parameter in DataWatcherEntry.VersionEntry" rel="nofollow">T</a>&gt;&nbsp;key, int&nbsp;index)</code> 
            <div>
             Create a new VersionEntry
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
           <td><code>int</code></td> 
           <td><code><span><a rel="nofollow">compareTo</a></span>(<a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherEntry.VersionEntry</a>&lt;?&gt;&nbsp;o)</code></td> 
          </tr> 
          <tr> 
           <td><code>int</code></td> 
           <td><code><span><a rel="nofollow">getIndex</a></span>()</code> 
            <div>
             Get the entry's index
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;<a title="type parameter in DataWatcherEntry.VersionEntry" rel="nofollow">T</a>&gt;</code></td> 
           <td><code><span><a rel="nofollow">getKey</a></span>()</code> 
            <div>
             Get the entry's key
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="class in fr.il_totore.entitymetadata.util" rel="nofollow">ServerVersion</a></code></td> 
           <td><code><span><a rel="nofollow">getVersion</a></span>()</code> 
            <div>
             Get entry's version
            </div> </td> 
          </tr> 
         </tbody>
        </table>
        
         *  ### Methods inherited from class java.lang.Object ###
            
            `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

 *   *  ### Constructor Detail ###
        
         *  #### VersionEntry ####
            
                public VersionEntry(ServerVersion version,
                                    DataWatcherKey<T> key,
                                    int index)
            
            Create a new VersionEntry
            
            Parameters:
            
            `version` \- the entry's version
            
            `key` \- the entry's `DataWatcherKey`
            
            `index` \- the value/index
    
     *  ### Method Detail ###
        
         *  #### getVersion ####
            
                public ServerVersion getVersion()
            
            Get entry's version
            
            Returns:
            
            the entry's version
        
         *  #### getKey ####
            
                public DataWatcherKey<T> getKey()
            
            Get the entry's key
            
            Returns:
            
            the entry's key
        
         *  #### getIndex ####
            
                public int getIndex()
            
            Get the entry's index
            
            Returns:
            
            the entry's index
        
         *  #### compareTo ####
            
                public int compareTo(DataWatcherEntry.VersionEntry<?> o)
            
            Specified by:
            
            `compareTo` in interface `java.lang.Comparable<DataWatcherEntry.VersionEntry<?>>`

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