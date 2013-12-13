<%@page import="sun.awt.AppContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="factoryfun.donnees.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>FactoryFun</title>
		<link rel="stylesheet" type="text/css" href="/assets/factory/css/style2.css">
	</head>
	<body>
		<div id="plateau" style="background-color : rgba(200, 200, 200, 0.5);">
		</div>
		<script>
			var i;
			var nbColonnes = 7;
			var nbLignes = 15;
			var size_case = 50;
			var partie = {};
			var plateau = [];
			
			var plateau_div = document.querySelector('#plateau');
			
			for (i = 0; i < nbColonnes; i++)
			{
				plateau.push([]);
				
				for (j = 0; j < nbLignes; j++)
				{
					plateau[i].push({div : null, x : j * 50, y : i * 50});
					
					var div = document.createElement('div');
					div.setAttribute('class', 'composant');
					div.setAttribute('style', 'border : 1px solid black; width : 50px; height : 50px; position : absolute; top : ' + (i * 50) + 'px; left : ' + (j * 50) + 'px;');
					
					plateau_div.appendChild(div);
				}
			}
		</script>
	</body>
</html>