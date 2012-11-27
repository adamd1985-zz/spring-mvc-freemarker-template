<ul id="ul-menu">
	<li><a href="categories.html">Categories</a></li>
	<li><a href="terms.html">Terms</a></li>
	<li><a href="facets.html">Facets</a></li>
	<li><a href="banners.html">Banners</a></li>
</ul>


<#import "spring.ftl" as spring />
<#assign authz=JspTaglibs["/WEB-INF/tlds/authz.tld"]>
	
<H2><@spring.message "welcome"/></H2>

<@authz.authorize ifAllGranted='ROLE_USER'>
	<P>
	<A href="<@spring.url '/findOwners.htm'/>">Find owner</A>
</@authz.authorize>

<@authz.authorize ifAllGranted='ROLE_USER'>
	<P>
	<A href="<@spring.url '/vets.htm'/>">Display all veterinarians</A>
</@authz.authorize>

<@authz.authorize ifAllGranted='ROLE_ADMIN'>
     <P>
     <a href="<@spring.url '/administration.htm'/>">Administration</a>
</@authz.authorize>
