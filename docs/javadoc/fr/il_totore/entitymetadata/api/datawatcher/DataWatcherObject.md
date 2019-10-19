DataWatcherObject (EntityMetadata 1.0-SNAPSHOT API)

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

## Interface DataWatcherObject<F,T> ##

 *  --------------------
    
      
    
    
        public interface DataWatcherObject<F,T>

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
           <td><code><a title="type parameter in DataWatcherObject" rel="nofollow">T</a></code></td> 
           <td><code><span><a rel="nofollow">bukkitToNotch</a></span>(<a title="type parameter in DataWatcherObject" rel="nofollow">F</a>&nbsp;from)</code> 
            <div>
             Transform the F (From/Bukkit) value to a T (To/Notchian) value
            </div> </td> 
          </tr> 
          <tr> 
           <td><code>int</code></td> 
           <td><code><span><a rel="nofollow">getIndex</a></span>()</code> 
            <div>
             Return the 
             <a title="interface in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow"><code>DataWatcherObject</code></a>'s index
            </div> </td> 
          </tr> 
          <tr> 
           <td><code><a title="type parameter in DataWatcherObject" rel="nofollow">F</a></code></td> 
           <td><code><span><a rel="nofollow">notchToBukkit</a></span>(<a title="type parameter in DataWatcherObject" rel="nofollow">T</a>&nbsp;to)</code> 
            <div>
             Transformed the T (To/Notchian) value to F (From/Bukkit) value
            </div> </td> 
          </tr> 
         </tbody>
        </table>

 *   *  ### Method Detail ###
        
         *  #### getIndex ####
            
                int getIndex()
            
            Return the `DataWatcherObject`'s index
            
            Returns:
            
            Return the `DataWatcherObject`'s index
        
         *  #### bukkitToNotch ####
            
                T bukkitToNotch(F from)
            
            Transform the F (From/Bukkit) value to a T (To/Notchian) value
            
            Parameters:
            
            `from` \- T value to transform
            
            Returns:
            
            F value transformed
        
         *  #### notchToBukkit ####
            
                F notchToBukkit(T to)
            
            Transformed the T (To/Notchian) value to F (From/Bukkit) value
            
            Parameters:
            
            `to` \- T value to transform
            
            Returns:
            
            F value transformed

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