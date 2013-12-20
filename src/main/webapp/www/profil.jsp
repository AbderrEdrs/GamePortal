<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Profil utilisateur</title>
        <jsp:include page="/views/partials/header.jsp" />
    </head>
    <style type="text/css">

    	#tab1 {
		    margin-top: 18px;
		}
		table {
		    border-collapse: collapse;
		    border-spacing: 0;
		}
		#col1 {
		    color: #006EA7;
		    font-size: 12px;
		    font-weight: bold;
		    width: 163px;
		}
		#col2 {
		    color: #646464;
		    font-size: 12px;
		}

    </style>
    <body>
    	<pre>
    		



    	</pre>
    	<div class="container">
    		<div class="hero-unit">
    			<h3> Profil </h3><hr>
		        <%-- Affichage de la chaîne "message" transmise par la servlet --%>
		        <div class="${ style }">${ message }</div>
		        <%-- Puis affichage des données enregistrées dans le bean "client" transmis par la servlet --%>
		        <div><img src="/assets/images/${user.avatar }"></div>
		        <table id="tab1">
					<tbody><tr>
					<td id="col1">Pseudo</td>
					<td id="col2">${user.username }</td>
					</tr>


					<tr>
					<td id="col1">Nom</td>
					<td id="col2">${ user.lastname }</td>
					</tr>


					<tr>
					<td id="col1">Prénom</td>
					<td id="col2">${ user.firstname }</td>
					</tr>


					<tr>
					<td id="col1">Email</td>
					<td id="col2">${ user.email }</td>
					</tr>
					</tbody>
				</table>
				<br/>
				<form method="POST" action="/UpdateProfilServelt">
					<input type="hidden" name="username" value="${ user.username }"/>
					<input type="hidden" name="lastname" value="${ user.lastname }"/>
					<input type="hidden" name="firstname" value="${ user.firstname }"/>
					<input type="hidden" name="email" value="${ user.email }"/>
					<input type="hidden" name="update" value="showprofil"/>
					
					<button class="btn btn-primary" href="/updateProfil.jsp">Modifier mon profil</button>
				</form>
				
		    </div>	
	    </div>
    </body>
</html>