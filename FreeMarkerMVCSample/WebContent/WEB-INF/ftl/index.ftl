<html>
  	<head>
		<style>
	 	 ul {
			list-style-type:none;
			margin:0;
			padding:0;
			overflow:hidden;
		}
		
		li {
			float:left;
		}
		
		a:link,a:visited {
			display:block;
			width:120px;
			font-weight:bold;
			color:#FFFFFF;
			background-color:#98bf21;
			text-align:center;
			padding:4px;
			text-decoration:none;
			text-transform:uppercase;
		}
	
		a:hover,a:active {
			background-color:#7A991A;
		}
		
		</style>
		
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js" type="text/javascript"></script>
		
		<script>
			$(document).ready(function() {
			
				$("#ul-menu li a").click(function() {
				   $.ajax({
					  url: "categories.html"
					}).done(function(data) { 
					  $("#div-content").html(data);
					});
					
				   return false;
				});
			});
		</script>

    </head>

    <body style="width:100%;height:100%">
        
    	<div id="div-header">
    	   <#include "layout/header.ftl"/>
    	</div>
    	
    	<div id="div-menu">
    	   <#include "layout/menu.ftl"/>
    	</div>
    	
    	<div id="div-content">
    	</div>
    	
    	<div id="div-footer">
    	   <#include "layout/footer.ftl"/>
    	</div>
    </body>
    
</html>