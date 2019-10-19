DataWatcherRegistry (EntityMetadata 1.0-SNAPSHOT API)

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

## Interface DataWatcherRegistry ##

 *  --------------------
    
      
    
    
        public interface DataWatcherRegistry

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
           <td><code>&lt;F&gt;&nbsp;<a title="interface in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherSerializer</a>&lt;F,?&gt;</code></td> 
           <td><code><span><a rel="nofollow">getSerializer</a></span>(<a title="class in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow">DataWatcherKey</a>&lt;F&gt;&nbsp;key)</code> 
            <div>
             Get the 
             <a title="interface in fr.il_totore.entitymetadata.api.datawatcher" rel="nofollow"><code>DataWatcherSerializer</code></a> put with the given key.
            </div> </td> 
          </tr> 
         </tbody>
        </table>

 *   *  ### Method Detail ###
        
         *  #### getSerializer ####
            
                <F> DataWatcherSerializer<F,?> getSerializer(DataWatcherKey<F> key)
            
            Get the `DataWatcherSerializer` put with the given key.
            
            Type Parameters:
            
            `F` \- the 'From' type of the `DataWatcherKey`
            
            Parameters:
            
            `key` \- the key associated with the wanted serializer
            
            Returns:
            
            the `DataWatcherSerializer` put with the given key or null if absent

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