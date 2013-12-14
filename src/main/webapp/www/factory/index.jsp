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
	  <link rel="stylesheet" type="text/css" href="/assets/factory/css/style3.css">
	</head>
	<body>
	  <!-- Le reste du contenu -->
	  <table style="margin : auto;  margin-top : 50px; font-family : 'arial'; font-size : 40px;">
	  	<tbody>
	  		<% Composant[][] plateau = ((Plateau) request.getAttribute("plateau")).getPlateau(); %>
	  		<%
	  		String affichage = "";
	  		
	  		for (int i = 0; i < plateau.length; i++)
			{
				affichage += "<tr>";
						
				for (int j = 0; j < plateau[i].length; j++)
				{
					String composant = (plateau[i][j] == null) ? "" : plateau[i][j].toString();
					
					affichage += "<td><div>" + composant + "</div></td>";
				}
				
				affichage += "</tr>";
			}
	  		out.print(affichage);
	  		%>
	  	</tbody>
	  </table>
	  <script type="text/javascript">
	  	var composants = document.querySelectorAll('div');
	  	
	  	for (var i = 0; i < composants.length; i++)
	  	{
	  		composants[i].onclick =	function(e)
	  								{
	  									this.parentNode.nextElementSibling.parentNode.removeChild(this.parentNode.nextElementSibling);
	  									this.parentNode.setAttribute('colspan', '2');
	  									this.parentNode.style.width = '201px';
	  									this.innerHTML = '<img src="/assets/factory/img/machine.png"/>';
	  								};
	  	}
	  	
	  	
	  	function coordonnees(element)
	  	{
	  		var position = element;
	  										
	  		var v_left = position.offsetLeft + toInt(getComputedStyle(position, null).borderLeftWidth);
	  		var v_top = position.offsetTop + toInt(getComputedStyle(position, null).borderTopWidth);
	  		
	  		while(position = position.offsetParent)
	  		{
	  			v_left += position.offsetLeft + toInt(getComputedStyle(position, null).borderLeftWidth);
	  			v_top += position.offsetTop + toInt(getComputedStyle(position, null).borderTopWidth);
	  		}
	  		
	  		return {left : v_left, top : v_top};
	  	};

	  	function toInt(element)
	  	{
	  		return parseInt(element.substring(0, element.length - 2));
	  	}
	  	
	  	
	  	var cmd_pressed = {};
	  	var destinations = [];
	  	var destination = null;
	  	
	  	
	  	
	  	var cmd_mousedown =	function(e)
							{
								e.preventDefault();
					
								//this.parentNode.style.height = toInt(getComputedStyle(this.parentNode).height) + 'px';
					
								var c = coordonnees(this);
								//this.style.width = toInt(getComputedStyle(this).width) + 'px';
								this.style.top = c.top + 'px';
								this.style.left = c.left + 'px';
								this.style.position = 'absolute';
								this.style.zIndex = '1';
					
								cmd_pressed.div = this;
								cmd_pressed.dx = e.clientX - c.left;											
								cmd_pressed.dy = e.clientY - c.top;
								this.style.cursor = '-webkit-grabbing';
								document.body.style.cursor = '-webkit-grabbing';
							};

		var cmd_mousemove =	function(e)
							{
								if (cmd_pressed.div)
								{
									cmd_pressed.div.style.top = (e.clientY - cmd_pressed.dy) + 'px';
									cmd_pressed.div.style.left = (e.clientX - cmd_pressed.dx) + 'px';									
								}
							};
				
		var cmd_mouseup =	function(e)
							{
								if (cmd_pressed.div)
								{
									cmd_pressed.div.removeAttribute('style');
									document.body.style.cursor = '';
									cmd_pressed = {};
								}
							};
		
		
		
		var ok = document.querySelector('#ok');
		
		ok.onmousedown = cmd_mousedown;
		
		
		
		
		
		
		
		
		
		
		
		var event_pressed = '';
		
		window.onmousemove =	function(e)
								{
									cmd_mousemove(e);
								};
					
		window.onmouseup =	function(e)
							{
								cmd_mouseup(e);
							};
	  </script>
	</body>
</html>