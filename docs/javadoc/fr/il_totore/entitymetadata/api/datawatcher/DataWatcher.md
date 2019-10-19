DataWatcher (EntityMetadata 1.0-SNAPSHOT API)

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

## Interface DataWatcher ##

 *  --------------------
    
      
    
    
        public interface DataWatcher

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
           <td><code>&lt;F,T&gt;&nbsp;F</code></td> 
           <td><code><span><a rel="nofollow">get</a></span>(<a title="interface in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherObject</a>&lt;F,T&gt;&nbsp;object)</code> 
            <div>
             Get the F value at the 
             <a title="interface in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow"><code>DataWatcherObject</code></a>'s index
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>&lt;F,T&gt;&nbsp;void</code></td> 
           <td><code><span><a rel="nofollow">set</a></span>(<a title="interface in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherObject</a>&lt;F,T&gt;&nbsp;object, F&nbsp;value)</code> 
            <div>
             Set the F value at the 
             <a title="interface in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow"><code>DataWatcherObject</code></a>'s index
            </div> </td> 
          </tr> 
         </tbody>
        </table>

 *   *  ### Method Detail ###
        
         *  #### set ####
            
                <F,T> void set(DataWatcherObject<F,T> object,
                               F value)
            
            Set the F value at the `DataWatcherObject`'s index
            
            Type Parameters:
            
            `F` \- The Bukkit value (From)
            
            `T` \- The Notch value (To)
            
            Parameters:
            
            `object` \- The `DataWatcherObject` used to set the value
            
            `value` \- The F value to set
        
         *  #### get ####
            
                <F,T> F get(DataWatcherObject<F,T> object)
            
            Get the F value at the `DataWatcherObject`'s index
            
            Type Parameters:
            
            `F` \- The Bukkit value (From)
            
            `T` \- The Notch value (To)
            
            Parameters:
            
            `object` \- The `DataWatcherObject` used to get the value
            
            Returns:
            
            F value at the `DataWatcherObject`'s index

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