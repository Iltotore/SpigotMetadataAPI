DataWatcherEntry (EntityMetadata 1.0-SNAPSHOT API)

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

## Class DataWatcherEntry ##

 *  java.lang.Object
 *   *  fr.il\_totore.entitymetadata.api.datawatcher.DataWatcherEntry

 *  --------------------
    
      
    
    
        public class DataWatcherEntry
        extends java.lang.Object

 *   *  ### Nested Class Summary ###
        
        <table> 
         <span>Nested Classes</span>
         <span>&nbsp;</span> 
         <tbody>
          <tr> 
           <th>Modifier and Type</th> 
           <th>Class and Description</th> 
          </tr> 
          <tr> 
           <td><code>static class&nbsp;</code></td> 
           <td><code><span><a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherEntry.VersionEntry</a>&lt;<a title="type parameter in DataWatcherEntry.VersionEntry" rel="nofollow">T</a>&gt;</span></code>&nbsp;</td> 
          </tr> 
         </tbody>
        </table>
    
     *  ### Field Summary ###
        
        <table> 
         <span>Fields</span>
         <span>&nbsp;</span> 
         <tbody>
          <tr> 
           <th>Modifier and Type</th> 
           <th>Field and Description</th> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherEntry</a></code></td> 
           <td><code><span><a rel="nofollow">BAT_FLY</a></span></code>&nbsp;</td> 
          </tr> 
          <tr> 
           <td><code>static <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherEntry</a></code></td> 
           <td><code><span><a rel="nofollow">GHAST_ATTACK</a></span></code>&nbsp;</td> 
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
           <td><code><span><a rel="nofollow">DataWatcherEntry</a></span>()</code>&nbsp;</td> 
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
           <td><code><a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherEntry</a></code></td> 
           <td><code><span><a rel="nofollow">addVersion</a></span>(<a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherEntry.VersionEntry</a>&nbsp;entry)</code> 
            <div>
             Add a version support for this 
             <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow"><code>DataWatcherEntry</code></a>
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherEntry.VersionEntry</a></code></td> 
           <td><code><span><a rel="nofollow">getVersion</a></span>(<a title="class in fr.il_totore.entitymetadata.util" rel="nofollow">ServerVersion</a>&nbsp;version)</code> 
            <div>
             Get a 
             <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow"><code>DataWatcherEntry.VersionEntry</code></a> from his 
             <a title="class in fr.il_totore.entitymetadata.util" rel="nofollow"><code>ServerVersion</code></a>
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>boolean</code></td> 
           <td><code><span><a rel="nofollow">hasVersion</a></span>(<a title="class in fr.il_totore.entitymetadata.util" rel="nofollow">ServerVersion</a>&nbsp;version)</code> 
            <div>
             Check if a 
             <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow"><code>DataWatcherEntry.VersionEntry</code></a> exists for this 
             <a title="class in fr.il_totore.entitymetadata.util" rel="nofollow"><code>ServerVersion</code></a>
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>void</code></td> 
           <td><code><span><a rel="nofollow">removeVersion</a></span>(<a title="class in fr.il_totore.entitymetadata.util" rel="nofollow">ServerVersion</a>&nbsp;version)</code> 
            <div>
             Remove a version support for this 
             <a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow"><code>DataWatcherEntry</code></a>
            </div> </td> 
          </tr> 
         </tbody>
        </table>
        
         *  ### Methods inherited from class java.lang.Object ###
            
            `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

 *   *  ### Field Detail ###
        
         *  #### GHAST\_ATTACK ####
            
                public static final DataWatcherEntry GHAST_ATTACK
        
         *  #### BAT\_FLY ####
            
                public static final DataWatcherEntry BAT_FLY
    
     *  ### Constructor Detail ###
        
         *  #### DataWatcherEntry ####
            
                public DataWatcherEntry()
    
     *  ### Method Detail ###
        
         *  #### addVersion ####
            
                public DataWatcherEntry addVersion(DataWatcherEntry.VersionEntry entry)
            
            Add a version support for this `DataWatcherEntry`
            
            Parameters:
            
            `entry` \- the given `DataWatcherEntry.VersionEntry`
            
            Returns:
            
            the `DataWatcherEntry`
        
         *  #### removeVersion ####
            
                public void removeVersion(ServerVersion version)
            
            Remove a version support for this `DataWatcherEntry`
            
            Parameters:
            
            `version` \- the given `DataWatcherEntry.VersionEntry`
        
         *  #### getVersion ####
            
                public DataWatcherEntry.VersionEntry getVersion(ServerVersion version)
            
            Get a `DataWatcherEntry.VersionEntry` from his `ServerVersion`
            
            Parameters:
            
            `version` \- the given `DataWatcherEntry.VersionEntry`
            
            Returns:
            
            the `DataWatcherEntry.VersionEntry` associated or null if not present
        
         *  #### hasVersion ####
            
                public boolean hasVersion(ServerVersion version)
            
            Check if a `DataWatcherEntry.VersionEntry` exists for this `ServerVersion`
            
            Parameters:
            
            `version` \- the given `ServerVersion`
            
            Returns:
            
            true if a `DataWatcherEntry.VersionEntry` with this version exists

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