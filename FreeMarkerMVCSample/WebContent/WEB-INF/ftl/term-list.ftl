<table class="datatable">
    <tr>
       <th>Name</th>
    </tr>
    
    <#list model["terms"] as term>
	    <tr>
	        <td>${term.name}</td>
	    </tr>
    </#list>  
</table>