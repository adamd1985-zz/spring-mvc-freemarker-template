<table class="datatable">
    <tr>
       <th>Name</th>
    </tr>
    
    <#list model["list"] as banner>
	    <tr>
	        <td>${banner.name}</td>
	    </tr>
    </#list>
</table>