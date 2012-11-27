<table class="datatable">
    <tr>
       <th>Name</th>
    </tr>
    
    <#list model["list"] as facet>
	    <tr>
	        <td>${facet.name}</td>
	    </tr>
    </#list>
</table>