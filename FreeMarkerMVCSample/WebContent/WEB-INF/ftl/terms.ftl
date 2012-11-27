<table class="datatable">
    <tr>
       <th>Name</th>
    </tr>
    
    <#list model["list"] as term>
	    <tr>
	        <td>${term.name}</td>
	    </tr>
    </#list>
</table>